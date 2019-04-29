package com.wxy.ics.common.exception;


import com.wxy.ics.common.enums.ErrorCodeEnum;

/**
 * @author liutuo
 * @date 2019-03-28
 */
public class MemberRuntimeException extends RuntimeException {

    private int code;
    private String msg;

    public MemberRuntimeException() {
        super();
    }

    public MemberRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemberRuntimeException(String message) {
        super(message);
    }

    public MemberRuntimeException(Throwable cause) {
        super(cause);
    }

    public MemberRuntimeException(int code, String msg) {
        super(code + ":" + msg);
        this.code = code;
        this.msg = msg;
    }

    public MemberRuntimeException(ErrorCodeEnum errorCodeConstants) {
        super(errorCodeConstants.getErrorCode() + ":" + errorCodeConstants.getErrorMessage());
        this.code = errorCodeConstants.getErrorCode();
        this.msg = errorCodeConstants.getErrorMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
