package com.wxy.ics.member.remote;


import com.wxy.ics.member.dto.MemberDTO;
import com.wxy.ics.member.entity.PageParam;
import com.wxy.ics.member.entity.PageResponse;
import com.wxy.ics.member.remote.hystrix.MemberFeignHystrixImpl;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 这里犯了一个很sb的错误，继承了BaseService接口没有使用Htpp注解标注导致报错
 * Caused by: java.lang.IllegalStateException: Method delete not annotated with HTTP method type (ex. GET, POST)
 */

/**
 * Member实体
 * @author wxy
 * @date 2019/03/14
 */
@FeignClient(value = "ICS-MEMBER",fallback = MemberFeignHystrixImpl.class)
public interface MemberFeignService {
    @GetMapping(value = "/member/{id}")
    ReturnResultVO<MemberVO> getMemberById(@PathVariable("id") Long id);

    @PostMapping(value = "/member")
    ReturnResultVO<Void> addMember(@RequestBody MemberDTO memberDTO);

    @GetMapping(value = "/members/page")
    ReturnResultVO<PageResponse<MemberVO>> queryMemberPageList(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize")int pageSize);

}
