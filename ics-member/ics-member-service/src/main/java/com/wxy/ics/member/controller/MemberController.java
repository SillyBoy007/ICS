package com.wxy.ics.member.controller;

import com.wxy.ics.member.common.controller.BaseController;
import com.wxy.ics.member.domain.Member;
import com.wxy.ics.member.service.MemberService;
import entity.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.wxy.ics.common.enums.CodeMsg.*;
/**
 *MemberController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
@RequestMapping("/api/member")
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public ReturnResult<Member> getMemberById(@PathVariable("id") Long id){
        ReturnResult<Member> returnResult = new ReturnResult<>();
        returnResult.setCode(SUCCESS.getKey());
        returnResult.setData(memberService.selectByKey(id));
        returnResult.setMsg(SUCCESS.getMessage());
        returnResult.setSuccess(true);
        return returnResult;
    }

}
