package com.wxy.ics.member.controller;

import com.wxy.ics.member.common.controller.BaseController;
import com.wxy.ics.member.domain.Member;
import com.wxy.ics.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/member")
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") Long id){
        return memberService.selectByKey(id);
    }

}
