//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wxy.ics.common.enums;

/**
 * codemsg枚举类
 *
 * @author wxy
 * @date 2019/03/14
 */
public enum CodeEnum {
    /**
     * 成功
     */
    SUCCESS(0, "success"),
    FAIL(-1,"fail"),
    SYSTEM_EXCEPTION(500,"未知异常，请联系管理员"),
    ILLEGAL_ARGUMENT(100,"参数错误"),


    BIND_ERROR(500101, "参数校验异常：%s"),
    REQUEST_ILLEGAL(500102, "请求非法"),
    ACCESS_LIMIT_REACHED(500104, "访问太频繁！"),
    API_VERSION_EMPTY(500105, "API版本号缺失！"),
    API_VERSION_WRONG(500106, "API版本号错误！"),
    SESSION_ERROR(500210, "Session不存在或者已经失效"),
    PASSWORD_EMPTY(500211, "登录密码不能为空"),
    MOBILE_EMPTY(500212, "手机号不能为空"),
    MOBILE_ERROR(500213, "手机号格式错误"),
    MOBILE_NOT_EXIST(500214, "手机号不存在"),
    PASSWORD_ERROR(500215, "密码错误"),
    LOGIN_TIMEOUT(500216, "尚未登录或登录超时"),
    UPLOADEXCELFILE(500301, "请上传Excel文件！"),
    UPLOADEXCELFILEIMPORT(500302, "请上传Excel文档再导入！"),
    FILENOTFOUNDORUPDATE(500302, "文件不存在或已被损坏，请联系管理员！"),
    UPLOADBRANDNOTFOUND(500302, "Excel导入品牌不存在，导入失败！"),
    DEPOTNOTFOUND(500302, "发货地址不存在，导入失败！"),
    ORDER_NOT_EXIST(500400, "订单不存在"),
    MERCHANT_NOT_ENTER(500500, "尚未入驻"),
    MERCHANT_NAME_EMPTY(500501, "企业名称不能为空"),
    MERCHANT_COMPANYCONTACT_EMPTY(500502, "联系人不能为空"),
    MERCHANT_CONTACTPHONE_EMPTY(500503, "联系人手机号不能为空"),
    MERCHANT_LICENSENUM_EMPTY(500504, "营业执照号不能为空"),
    MERCHANT_LEGALPERSONNAME_EMPTY(500506, "法人姓名不能为空"),
    MERCHANT_LEGALIDCARD_EMPTY(500507, "法人身份证不能为空"),
    MERCHANT_MERTYPE_EMPTY(500508, "企业类型不能为空"),
    MERCHANT_NAME_EXIST(500509, "企业名称已存在"),
    MERCHANT_LICENSENUM_EXIST(500510, "营业执照号已使用"),
    MERCHANT_ID_NOT_EXIST(500511, "商户ID不存在"),
    MERCHANT_FILE_HANDEL_ERROR(500512, "上传附件处理出现异常"),
    ACTIVITY_USER_NOT_EXISTS(500601, "用户不存在！"),
    ACTIVITY_DATEFORMAT_ERROR(500602, "获取用户创建日期错误！"),
    ACTIVITY_NOT_EXISTS(500603, "活动不存在！"),
    SEARCH_PRODUCT_ERROR_BY_ACTIVITY_ID(500604, "活动ID查商品信息出错！"),
    UPDATE_PRODUCT_ONEVERY_DAY_STATEMENT(500605, "活动ID查商品信息出错！"),
    /**
     * 微信登陆
     */
    ACCESSTOKEN_GET_FAIL(600100,"第三方登录失败,accessToken为空"),
    WECHAT_LOGIN_ERROR(600101,"微信登陆异常"),

    /**
     * Http请求
     */
    HTTP_REQUEST_FAIL(700100, "HTTP请求失败"),

    /**
     *
     * 服务器异常
     */
    SERVER_ERROR(500100, "服务端异常"),
    CONNECT_TIMEOUT(500101,"连接超时");



    private int key;
    private String message;

    private CodeEnum(int key, String message) {
        this.key = key;
        this.message = message;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
