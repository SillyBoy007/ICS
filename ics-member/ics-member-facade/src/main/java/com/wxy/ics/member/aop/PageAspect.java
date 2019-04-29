package com.wxy.ics.member.aop;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxy.ics.common.exception.MemberRuntimeException;
import com.wxy.ics.member.entity.PageParam;
import com.wxy.ics.member.entity.PageResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class PageAspect {
    @Pointcut("execution(public com.wxy.ics.member.entity.PageResponse com.wxy.ics.member.service.*Service.*(..))")
    public void page(){}

    //环绕通知,环绕增强，相当于MethodInterceptor
    @Around("page()")
    public Object arround(ProceedingJoinPoint pjp) {
        try {
            Object[] args = pjp.getArgs();
            // 匹配组
            boolean match = args != null && args.length >= 1 && args[0] instanceof PageParam;
            if(match) {
                PageParam pageParam = (PageParam) args[0];
                PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize());
            }
            Object o =  pjp.proceed();
            if(match) {
                PageResponse pagination = (PageResponse) o;
                PageInfo appsPageInfo = new PageInfo(pagination.getList());
                pagination.setTotalPage((int)appsPageInfo.getTotal());
            }
            return o;
        } catch (Throwable e) {
            log.error("分页查询异常", e);
            throw new MemberRuntimeException("分页查询异常", e);
        } finally {
            PageHelper.clearPage();
        }
    }
}
