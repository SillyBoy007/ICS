package com.wxy.ics.member.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wxy.ics.member.common.utils.ObjectBuildUtils;
import com.wxy.ics.member.dao.entity.MemberPO;
import com.wxy.ics.member.dto.MemberDTO;
import com.wxy.ics.member.entity.PageParam;
import com.wxy.ics.member.entity.PageResponse;
import com.wxy.ics.member.remote.MemberFeignService;
import com.wxy.ics.member.service.MemberService;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import static com.wxy.ics.common.enums.CodeEnum.FAIL;
import static com.wxy.ics.common.enums.CodeEnum.SUCCESS;


/**
 *MemberController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
@Slf4j
@Api(value = "会员", tags = {"会员服务"})
public class MemberController extends BaseController implements MemberFeignService{
    @Autowired
    MemberService memberService;

    @ApiOperation(value = "根据用户id查询用户信息", notes = "根据用户id查询用户信息")
    @GetMapping(value = "/member/{id}")
    @ApiImplicitParams(
        {
            @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "path", dataTypeClass = Long.class)
        }
    )
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

    @ApiOperation(value = "新增用户", notes = "新增用户")
    @PostMapping(value = "/member")
    @Override
    public ReturnResultVO<Void> addMember(@RequestBody MemberDTO memberDTO) {
        MemberPO baseMember = ObjectBuildUtils.copy(memberDTO, MemberPO.class);
        boolean save = memberService.addMember(baseMember);

        if (save){
            return ReturnResultVO.success();
        }else{
            return ReturnResultVO.error(FAIL.getKey(),FAIL.getMessage());
        }
    }

    @ApiOperation(value = "分页查询用户信息", notes = "分页查询用户信息")
    @GetMapping(value = "/members/page")
    @ApiImplicitParams(
        {
            @ApiImplicitParam(name = "pageNum", value = "页数", required = true, paramType = "query", dataTypeClass = Long.class),
            @ApiImplicitParam(name = "pageSize", value = "每页记录数", required = true, paramType = "query", dataTypeClass = Long.class)

        }
    )
    @Override
    public ReturnResultVO<PageResponse<MemberVO>> queryMemberPageList(@RequestParam("pageNum")int pageNum, @RequestParam("pageSize")int pageSize) {
        PageResponse<MemberVO> memberVOPageResponse = memberService.queryMemberPageList(new PageParam(pageNum, pageSize));
        return ReturnResultVO.success("ok",memberVOPageResponse);
    }


}
