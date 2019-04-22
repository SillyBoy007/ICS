package com.wxy.ics.member.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wxy.ics.common.utils.SnowIdUtils;
import com.wxy.ics.member.common.utils.ObjectBuildUtils;
import com.wxy.ics.member.dao.entity.MemberPO;
import com.wxy.ics.member.dto.MemberDTO;
import com.wxy.ics.member.remote.MemberFeignService;
import com.wxy.ics.member.service.MemberService;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.wxy.ics.common.enums.CodeEnum.FAIL;
import static com.wxy.ics.common.enums.CodeEnum.SUCCESS;


/**
 *MemberController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
@Slf4j
public class MemberController extends BaseController implements MemberFeignService{
    @Autowired
    MemberService memberService;

    @GetMapping(value = "/member/query/{id}")
    public ReturnResultVO<MemberVO> getMemberById(@PathVariable("id") Long id){
        ReturnResultVO<MemberVO> returnResult;
        returnResult = new ReturnResultVO<>();
        returnResult.setCode(SUCCESS.getKey());
        QueryWrapper<MemberPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(MemberPO::getId,id);
        MemberPO baseMember = memberService.getOne(queryWrapper);
        MemberVO memberVO = ObjectBuildUtils.copy(baseMember, MemberVO.class);
        returnResult.setData(memberVO);
        returnResult.setMsg(SUCCESS.getMessage());
        returnResult.setSuccess(true);
        return returnResult;

    }

    @PostMapping(value = "/member/add")
    @Override
    public ReturnResultVO<Void> addMember(@RequestBody MemberDTO memberDTO) {
        MemberPO baseMember = ObjectBuildUtils.copy(memberDTO, MemberPO.class);
        baseMember.setCreateTime(new Date());
        baseMember.setUserCode(SnowIdUtils.createUserCode());
        baseMember.setId(SnowIdUtils.createUserCode());
        boolean save = memberService.save(baseMember);
        if (save){
            return ReturnResultVO.success();
        }else{
            return ReturnResultVO.error(FAIL.getKey(),FAIL.getMessage());
        }
    }


}
