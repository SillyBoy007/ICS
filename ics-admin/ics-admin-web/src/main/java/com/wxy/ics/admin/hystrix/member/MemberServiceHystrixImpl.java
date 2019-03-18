package com.wxy.ics.admin.hystrix.member;

import com.wxy.ics.admin.common.ReturnResult;
import com.wxy.ics.admin.entity.Member;
import com.wxy.ics.admin.service.member.FeignMemberService;
import org.springframework.stereotype.Component;
/**
 * MemberServiceHystrixImpl
 * @author wxy
 * @date 2019/03/14
 */
@Component
public class MemberServiceHystrixImpl implements FeignMemberService {
    @Override
    public ReturnResult<Member> getMemberById(Long id) {
        return ReturnResult.error();
    }
}
