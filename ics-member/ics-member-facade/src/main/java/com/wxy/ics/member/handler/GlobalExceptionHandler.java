package com.wxy.ics.member.handler;

import com.wxy.ics.common.enums.CodeEnum;
import com.wxy.ics.member.vo.ReturnResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 全局异常捕捉处理
     * @param ex .
     * @return .
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ReturnResultVO errorHandler(Exception ex) {
        log.error("global catch", ex);
        return ReturnResultVO.error(CodeEnum.SYSTEM_EXCEPTION.getKey(), ex.getMessage());
    }

    /**
     * 参数异常捕捉处理
     * @param ex .
     * @return .
     */
    @ResponseBody
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ReturnResultVO illegalArgumentExceptionHandler(IllegalArgumentException ex) {
        return ReturnResultVO.error(CodeEnum.ILLEGAL_ARGUMENT.getKey(), ex.getMessage());
    }
}
