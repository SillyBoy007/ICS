package com.wxy.ics.member.controller;

import com.wxy.ics.common.entity.vo.ReturnResultVO;
import com.wxy.ics.member.common.controller.BaseController;
import com.wxy.ics.member.domain.MemberPO;
import com.wxy.ics.member.orm.model.BaseMember;
import com.wxy.ics.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.wxy.ics.common.enums.CodeMsg.SERVER_ERROR;
import static com.wxy.ics.common.enums.CodeMsg.SUCCESS;

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
    public ReturnResultVO<BaseMember> getMemberById(@PathVariable("id") Long id){
        ReturnResultVO<BaseMember> returnResult;
        try {
            returnResult = new ReturnResultVO<>();
            returnResult.setCode(SUCCESS.getKey());
            returnResult.setData(memberService.selectByKey(id));
            returnResult.setMsg(SUCCESS.getMessage());
            returnResult.setSuccess(true);
            return returnResult;
        }catch (Exception e){
            returnResult = new ReturnResultVO<>();
            returnResult.setCode(SERVER_ERROR.getKey());
            returnResult.setMsg(SERVER_ERROR.getMessage());
            returnResult.setSuccess(false);
            log.error("查询id为{}的用户异常",id,e);
            return returnResult;
        }

    }
    @RequestMapping(value = "/get/member",method = RequestMethod.GET)
    public ReturnResultVO<MemberPO> getMemberByOpenId(){
        ReturnResultVO<MemberPO> returnResult;
        try {
            returnResult = new ReturnResultVO<>();
            returnResult.setCode(SUCCESS.getKey());
            returnResult.setData(memberService.getMemberByOpenId("we"));
            returnResult.setMsg(SUCCESS.getMessage());
            returnResult.setSuccess(true);
            return returnResult;
        }catch (Exception e){
            returnResult = new ReturnResultVO<>();
            returnResult.setCode(SERVER_ERROR.getKey());
            returnResult.setMsg(SERVER_ERROR.getMessage());
            returnResult.setSuccess(false);
           log.error("根据openId查询用户异常",e);
            return returnResult;
        }

    }
}
