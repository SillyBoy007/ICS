package com.wxy.ics.member.service;


import com.wxy.ics.member.common.service.BaseService;
import com.wxy.ics.member.domain.MemberPO;
import com.wxy.ics.member.orm.model.BaseMember;

/**
 *MemberService
 * @author wxy
 * @date 2019/03/14
 */
public interface MemberService extends BaseService<BaseMember> {
    MemberPO getMemberByOpenId(String openId);
}
