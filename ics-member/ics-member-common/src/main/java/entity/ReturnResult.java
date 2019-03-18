package entity;

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
public class ReturnResult<T> implements Serializable{
    private String msg;
    private int code;
    private T data;
    private boolean success = true;



    public ReturnResult(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ReturnResult(int code, String msg, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> ReturnResult<T> error() {
        return error(500, "未知异常，请联系管理员");
    }
    public static <T> ReturnResult<T> error(int code, String message) {
        ReturnResult<T> result = new ReturnResult<T>(code,message);
        result.setSuccess(false);
        return result;
    }
    public static <T> ReturnResult<T> successMsg(int code, String message,T data) {
        ReturnResult<T> result = new ReturnResult<T>(code,message,data);
        result.setSuccess(true);
        return result;
    }


}
