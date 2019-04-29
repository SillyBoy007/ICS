package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.base.Preconditions;
import com.wxy.ics.common.exception.MemberRuntimeException;
import com.wxy.ics.common.utils.SnowIdUtils;
import com.wxy.ics.member.common.RedisLock;
import com.wxy.ics.member.common.utils.ObjectBuildUtils;
import com.wxy.ics.member.dao.entity.MemberPO;
import com.wxy.ics.member.dao.mapper.BaseMemberMapper;
import com.wxy.ics.member.entity.PageParam;
import com.wxy.ics.member.entity.PageResponse;
import com.wxy.ics.member.service.MemberService;
import com.wxy.ics.member.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *MemberServiceImpl
 * @author wxy
 * @date 2019/03/14
 */
@Service("memberService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
@Slf4j
public class MemberServiceImpl extends ServiceImpl<BaseMemberMapper, MemberPO> implements MemberService {
    @Autowired
    private RedisLock redisLock;

    @Override
    public PageResponse<MemberVO> queryMemberPageList(PageParam pageParam) {
        List<MemberPO> list = list();
        if (list == null){
            list = new ArrayList<>();
        }
        List<MemberVO> memberVOS = ObjectBuildUtils.copy(list, MemberVO.class);
        return PageResponse.success(memberVOS,pageParam.getPageNum(),pageParam.getPageSize(),count());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addMember(MemberPO memberPO) {
        Preconditions.checkArgument(memberPO!=null && !StringUtils.isEmpty(memberPO.getEmail()),"参数错误 ");
        //redis锁，理论上应该是一个唯一标志，如手机号等，这里图方便给了电子邮箱
        String lockKey = "addMember_"+memberPO.getEmail();
        try {

            if(!redisLock.tryGetDistributedLock(lockKey,UUID.randomUUID().toString())){
                throw new MemberRuntimeException("操作冲突");
            }
            memberPO.setCreateTime(new Date());
            memberPO.setUserCode(SnowIdUtils.createUserCode());
            memberPO.setId(SnowIdUtils.createUserCode());
            return this.save(memberPO);
        }catch (MemberRuntimeException e){
            log.info("redis操作冲突,,memberPO:{}",memberPO,e);
            throw new MemberRuntimeException("操作冲突");
        } finally {
            redisLock.releaseDistributedLock(lockKey);
        }

    }
}
