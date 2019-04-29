package com.wxy.ics.common.enums;


import com.wxy.ics.member.vo.ReturnResultVO;

public enum ErrorCodeEnum {

    ACCORE_999(999, "", "数据库操作异常"),
    /**
     * RegisterServiceBusiImpl Begin
     **/
    ACCORE_100001(100001, "RegisterServiceBusiImpl.wechatRegister", "注册失败，会员信息表操作异常"),
    ACCORE_100002(100002, "RegisterServiceBusiImpl.wechatRegister", "注册失败，微信注册表操作异常"),
    ACCORE_100003(100003, "RegisterServiceBusiImpl.wechatRegister", "注册失败，会员买家角色表操作异常"),
    ACCORE_100004(100004, "RegisterServiceBusiImpl.wechatRegister", "微信注册数据库操作异常"),

    ACCORE_100011(100011, "RegisterServiceBusiImpl.mobileRegister", "短信验证码错误"),
    ACCORE_100012(100012, "RegisterServiceBusiImpl.mobileRegister", "注册失败，会员信息表操作异常"),
    ACCORE_100013(100013, "RegisterServiceBusiImpl.mobileRegister", "注册失败，手机注册表操作异常"),
    ACCORE_100014(100014, "RegisterServiceBusiImpl.mobileRegister", "注册失败，会员买家角色表操作异常"),
    ACCORE_100015(100015, "RegisterServiceBusiImpl.mobileRegister", "手机注册数据库操作异常"),


    ACCORE_100021(100021, "RegisterServiceBusiImpl.getLoginAuthCode", "短信验证码发送异常"),
    ACCORE_100031(100031, "RegisterServiceBusiImpl.VerifyToken", "Token已过期"),
    ACCORE_100032(100032, "RegisterServiceBusiImpl.VerifyToken", "Token错误"),
    ACCORE_100033(100033, "RegisterServiceBusiImpl.VerifyToken", "redis异常"),
    ACCORE_100041(100041, "RegisterServiceBusiImpl.bindPhone", "绑定手机号失败，短信验证码错误"),
    ACCORE_100042(100042, "RegisterServiceBusiImpl.bindPhone", "绑定手机号失败，手机注册表操作异常"),



    /** RegisterServiceBusiImpl End **/

    /**
     * FriendsServiceImpl Begin
     **/
    ACCORE_100101(100101, "FriendsServiceImpl.agreeAddFriend", "添加好友，好友申请表操作异常"),
    ACCORE_100102(100102, "FriendsServiceImpl.agreeAddFriend", "添加好友，好友关系表操作异常"),
    ACCORE_100103(100103, "FriendsServiceImpl.agreeAddFriend", "添加好友，数据库操作异常"),
    ACCORE_100104(100104, "FriendsServiceImpl.agreeAddFriend", "添加好友，更改好友关系表操作异常"),
    ACCORE_100105(100105, "FriendsServiceImpl.agreeAddFriend", "删除好友，更改好友关系表操作异常"),
    ACCORE_100106(100106, "FriendsServiceImpl.agreeAddFriend", "删除好友，数据库操作异常"),

    /** FriendsServiceImpl End **/

    /**
     * PhonebookServiceImpl Begin
     **/
    ACCORE_100201(100201, "PhonebookServiceImpl.upLoadPhoneBook", "上送通讯录，通讯录数量过多"),
    ACCORE_100900(100400, "", "获取新的朋友列表为空"),

    /** PhonebookServiceImpl End **/





    SYSTEMERROR_999999(999999, "SYSTEM.ERROR", "系统错误");
    /**
     * 错误code
     */
    private int errorCode;
    /**
     * 错误名称
     */
    private String errorName;
    /**
     * 错误信息
     */
    private String errorMessage;

    ErrorCodeEnum(int errorCode, String errorName, String errorMessage) {
        //错误编码
        this.errorCode = errorCode;
        //错误名称
        this.errorName = errorName;
        //错误详细信息
        this.errorMessage = errorMessage;
    }

    /**
     * 错误编码
     *
     * @return the errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * 错误编码
     *
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 错误名称
     *
     * @return the errorName
     */
    public String getErrorName() {
        return errorName;
    }

    /**
     * 错误名称
     *
     * @param errorName the errorName to set
     */
    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    /**
     * 错误详细信息
     *
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 错误详细信息
     *
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 错误详细信息
     * getErrorMessage
     *
     * @param args
     * @return
     */
    public String getErrorMessage(Object... args) {
        return String.format(errorMessage, args);
    }

    /**
     * generateError
     *
     * @param result
     * @return
     */
    public void generateError(ReturnResultVO result) {
        result.setSuccess(Boolean.FALSE);
        result.setCode(getErrorCode());
        result.setMsg(getErrorMessage());
    }
}
