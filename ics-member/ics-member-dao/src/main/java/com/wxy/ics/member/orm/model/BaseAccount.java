package com.wxy.ics.member.orm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account")
public class BaseAccount {
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
     * 微信openid
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
     * 账号状态
     */
    @Column(name = "account_status")
    private Boolean accountStatus;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取微信openid
     *
     * @return open_id - 微信openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信openid
     *
     * @param openId 微信openid
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
     * 获取账号状态
     *
     * @return account_status - 账号状态
     */
    public Boolean getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置账号状态
     *
     * @param accountStatus 账号状态
     */
    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}