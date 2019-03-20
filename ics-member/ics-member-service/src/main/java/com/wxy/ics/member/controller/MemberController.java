package com.wxy.ics.member.controller;

import com.wxy.ics.member.common.controller.BaseController;
import com.wxy.ics.member.po.MemberPO;
import com.wxy.ics.member.service.MemberService;
import entity.ReturnResult;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public ReturnResult<MemberPO> getMemberById(@PathVariable("id") Long id){
        ReturnResult<MemberPO> returnResult;
        try {
            returnResult = new ReturnResult<>();
            returnResult.setCode(SUCCESS.getKey());
            returnResult.setData(memberService.selectByKey(id));
            returnResult.setMsg(SUCCESS.getMessage());
            returnResult.setSuccess(true);
            return returnResult;
        }catch (Exception e){
            returnResult = new ReturnResult<>();
            returnResult.setCode(SERVER_ERROR.getKey());
            returnResult.setMsg(SERVER_ERROR.getMessage());
            returnResult.setSuccess(false);
            log.error("查询id为{}的用户异常",id,e);
            return returnResult;
        }

    }

}
