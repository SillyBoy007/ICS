package com.wxy.ics.admin.controller;




import com.alibaba.fastjson.JSONObject;
import com.wxy.ics.member.remote.FeignMemberService;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * FeignMemberController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
public class MemberController {
    @Autowired
    FeignMemberService feignMemberService;
    @RequestMapping(value = "/client/member/get/{id}",method = RequestMethod.GET)
    public ReturnResultVO<MemberVO> getMemberById(@PathVariable("id") Long id) {
        ReturnResultVO<MemberVO> memberById = feignMemberService.getMemberById(id);
        System.out.println(JSONObject.toJSONString(memberById));
        return  memberById;

    }
}
