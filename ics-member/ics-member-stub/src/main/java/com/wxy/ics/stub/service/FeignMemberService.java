package com.wxy.ics.stub.service;


import com.wxy.ics.stub.common.domain.Member;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这里犯了一个很sb的错误，继承了IService接口没有使用Htpp注解标注导致报错
 * Caused by: java.lang.IllegalStateException: Method delete not annotated with HTTP method type (ex. GET, POST)
 */

/**
 * Member实体
 * @author wxy
 * @date 2019/03/14
 */
@FeignClient(value = "ICS-MEMBER")
public interface FeignMemberService {
    @RequestMapping(value = "/api/member/get/{id}",method = RequestMethod.GET)
    Member getMemberById(@PathVariable("id") Long id);
}
