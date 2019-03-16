package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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

    public ReturnResult(String msg, int code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> ReturnResult<T> error() {
        return error(500, "未知异常，请联系管理员");
    }
    public static <T> ReturnResult<T> error(int code, String message) {
        ReturnResult result = new ReturnResult(code,message);
        result.setSuccess(false);
        return result;
    }



}
