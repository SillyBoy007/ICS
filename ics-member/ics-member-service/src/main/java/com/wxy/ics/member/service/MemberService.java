package com.wxy.ics.member.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wxy.ics.member.dao.entity.MemberPO;
import com.wxy.ics.member.entity.PageParam;
import com.wxy.ics.member.entity.PageResponse;
import com.wxy.ics.member.vo.MemberVO;

/**
 *MemberService
 * @author wxy
 * @date 2019/03/14
 */
public interface MemberService extends IService<MemberPO> {
    /**
     * 分页查询会员列表
     * @param pageParam
     * @return
     */
    PageResponse<MemberVO> queryMemberPageList(PageParam pageParam);

    /**
     * 新增会员
     * @param memberPO
     * @return
     */
    boolean addMember(MemberPO memberPO);
}
