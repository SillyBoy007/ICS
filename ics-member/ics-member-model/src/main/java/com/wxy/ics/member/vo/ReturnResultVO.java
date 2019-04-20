package com.wxy.ics.member.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回类型类
 *
 * @author wxy
 * @date 2019/03/14
 */
@Data
@NoArgsConstructor
public class ReturnResultVO<T> implements Serializable{
    private String msg;
    private Integer code;
    private T data;
    private Boolean success;



    public ReturnResultVO(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ReturnResultVO(int code, String msg, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> ReturnResultVO<T> error() {
        return error(500, "未知异常，请联系管理员");
    }
    public static <T> ReturnResultVO<T> error(int code, String message) {
        ReturnResultVO<T> result = new ReturnResultVO<T>(code,message);
        result.setSuccess(false);
        return result;
    }
    public static <T> ReturnResultVO<T> success() {
        ReturnResultVO<T> result = new ReturnResultVO<T>(0,"ok",null);
        result.setSuccess(true);
        return result;
    }
    public static <T> ReturnResultVO<T> success(String message) {
        ReturnResultVO<T> result = new ReturnResultVO<T>(0,message,null);
        result.setSuccess(true);
        return result;
    }
    public static <T> ReturnResultVO<T> success(String message, T data) {
        ReturnResultVO<T> result = new ReturnResultVO<T>(0,message,data);
        result.setSuccess(true);
        return result;
    }


}
