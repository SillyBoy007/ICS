package com.wxy.ics.admin.hystrix.member;

import com.wxy.ics.admin.common.ReturnResult;
import com.wxy.ics.admin.entity.Member;
import com.wxy.ics.admin.service.member.FeignMemberService;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceHystrixImpl implements FeignMemberService {
    public ReturnResult<Member> getMemberById(Long id) {
        return ReturnResult.error();
    }
}
