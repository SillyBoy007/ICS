package com.wxy.ics.member.controller;

import com.wxy.ics.stub.common.domain.Member;
import com.wxy.ics.stub.service.FeignMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignMemberController {
    @Autowired
    FeignMemberService feignMemberService;
    @RequestMapping(value = "/api/member/get/{id}",method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") Long id) {
        Member member = feignMemberService.getMemberById(id);
        return member;
    }
}