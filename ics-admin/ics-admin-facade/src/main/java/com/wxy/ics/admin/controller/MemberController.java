package com.wxy.ics.admin.controller;




import com.alibaba.fastjson.JSONObject;
import com.wxy.ics.member.dto.MemberDTO;
import com.wxy.ics.member.remote.MemberFeignService;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * FeignMemberController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
public class MemberController {
    @Autowired
    MemberFeignService memberFeignService;

    @GetMapping(value = "/client/member/{id}")
    public ReturnResultVO<MemberVO> getMemberById(@PathVariable("id") Long id) {
        ReturnResultVO<MemberVO> memberById = memberFeignService.getMemberById(id);
        System.out.println(JSONObject.toJSONString(memberById));
        return memberById;

    }

    @PostMapping(value = "/client/member")
    public ReturnResultVO<Void> addMember(@RequestBody MemberDTO memberDTO) {
        return memberFeignService.addMember(memberDTO);
    }
}