package com.wxy.ics.member.controller;

import com.wxy.ics.stub.common.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 会员Controller
 *
 * @author wxy
 * @date 2019/03/14
 */
@RestController
@RequestMapping("/client/member")
public class MemberController  {

    private static final String REST_URL_PREFIX = "http://ICS-MEMBER";
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") Long id){
        Member member = restTemplate.getForObject(REST_URL_PREFIX + "/api/member/get/"+id, Member.class);
        return member;
    }

}
