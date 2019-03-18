package com.wxy.ics.member.domain;

import java.util.Date;
import javax.persistence.*;
/**
 * Member
 * @author wxy
 * @date 2019/03/14
 */
public class Member {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 用户编号
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 微信open_id
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 微信union_id
     */
    @Column(name = "union_id")
    private String unionId;

    /**
     * 微信头像
     */
    @Column(name = "wx_avator")
    private String wxAvator;

    /**
     * 微信昵称
     */
    @Column(name = "wx_nike_name")
    private String wxNikeName;

    /**
     * 用户状态
     */
    @Column(name = "user_status")
    private Boolean userStatus;

    /**
     * 邀请人
     */
    @Column(name = "invite_user_id")
    private String inviteUserId;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取渠道
     *
     * @return channel - 渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 获取用户编号
     *
     * @return user_code - 用户编号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户编号
     *
     * @param userCode 用户编号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取微信open_id
     *
     * @return open_id - 微信open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信open_id
     *
     * @param openId 微信open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取微信union_id
     *
     * @return union_id - 微信union_id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置微信union_id
     *
     * @param unionId 微信union_id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    /**
     * 获取微信头像
     *
     * @return wx_avator - 微信头像
     */
    public String getWxAvator() {
        return wxAvator;
    }

    /**
     * 设置微信头像
     *
     * @param wxAvator 微信头像
     */
    public void setWxAvator(String wxAvator) {
        this.wxAvator = wxAvator == null ? null : wxAvator.trim();
    }

    /**
     * 获取微信昵称
     *
     * @return wx_nike_name - 微信昵称
     */
    public String getWxNikeName() {
        return wxNikeName;
    }

    /**
     * 设置微信昵称
     *
     * @param wxNikeName 微信昵称
     */
    public void setWxNikeName(String wxNikeName) {
        this.wxNikeName = wxNikeName == null ? null : wxNikeName.trim();
    }

    /**
     * 获取用户状态
     *
     * @return user_status - 用户状态
     */
    public Boolean getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态
     *
     * @param userStatus 用户状态
     */
    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取邀请人
     *
     * @return invite_user_id - 邀请人
     */
    public String getInviteUserId() {
        return inviteUserId;
    }

    /**
     * 设置邀请人
     *
     * @param inviteUserId 邀请人
     */
    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId == null ? null : inviteUserId.trim();
    }

    /**
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}