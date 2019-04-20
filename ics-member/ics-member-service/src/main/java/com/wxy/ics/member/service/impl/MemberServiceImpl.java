package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.MemberPO;
import com.wxy.ics.member.dao.mapper.BaseMemberMapper;
import com.wxy.ics.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *MemberServiceImpl
 * @author wxy
 * @date 2019/03/14
 */
@Service("memberService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MemberServiceImpl extends ServiceImpl<BaseMemberMapper, MemberPO> implements MemberService {
}
