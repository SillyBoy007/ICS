package com.wxy.ics.admin.service;


import com.wxy.ics.admin.domain.Member;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这里继承了IService接口没有使用Htpp注解标注导致报错
 * Caused by: java.lang.IllegalStateException: Method delete not annotated with HTTP method type (ex. GET, POST)
 */
@FeignClient(value = "ICS-MEMBER")
public interface FeignMemberService {
    @RequestMapping(value = "/api/member/get/{id}",method = RequestMethod.GET)
    Member getMemberById(@PathVariable("id") Long id);
}
