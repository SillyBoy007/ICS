package com.wxy.ics.member.orm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "seller")
public class BaseSeller {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商家状态
     */
    @Id
    @Column(name = "seller_status")
    private Boolean sellerStatus;

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
     * 商家编号
     */
    @Column(name = "seller_code")
    private String sellerCode;

    /**
     * 商家类型
     */
    @Column(name = "seller_type")
    private Boolean sellerType;

    /**
     * 昵称
     */
    @Column(name = "nike_name")
    private String nikeName;

    /**
     * 头像
     */
    private String avator;

    /**
     * 商家等级
     */
    @Column(name = "seller_level")
    private Byte sellerLevel;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 审核状态
     */
    @Column(name = "audit_status")
    private Boolean auditStatus;

    /**
     * 实名认证状态
     */
    @Column(name = "real_status")
    private Boolean realStatus;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

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
     * 获取商家状态
     *
     * @return seller_status - 商家状态
     */
    public Boolean getSellerStatus() {
        return sellerStatus;
    }

    /**
     * 设置商家状态
     *
     * @param sellerStatus 商家状态
     */
    public void setSellerStatus(Boolean sellerStatus) {
        this.sellerStatus = sellerStatus;
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
     * 获取商家编号
     *
     * @return seller_code - 商家编号
     */
    public String getSellerCode() {
        return sellerCode;
    }

    /**
     * 设置商家编号
     *
     * @param sellerCode 商家编号
     */
    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode == null ? null : sellerCode.trim();
    }

    /**
     * 获取商家类型
     *
     * @return seller_type - 商家类型
     */
    public Boolean getSellerType() {
        return sellerType;
    }

    /**
     * 设置商家类型
     *
     * @param sellerType 商家类型
     */
    public void setSellerType(Boolean sellerType) {
        this.sellerType = sellerType;
    }

    /**
     * 获取昵称
     *
     * @return nike_name - 昵称
     */
    public String getNikeName() {
        return nikeName;
    }

    /**
     * 设置昵称
     *
     * @param nikeName 昵称
     */
    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }

    /**
     * 获取头像
     *
     * @return avator - 头像
     */
    public String getAvator() {
        return avator;
    }

    /**
     * 设置头像
     *
     * @param avator 头像
     */
    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }

    /**
     * 获取商家等级
     *
     * @return seller_level - 商家等级
     */
    public Byte getSellerLevel() {
        return sellerLevel;
    }

    /**
     * 设置商家等级
     *
     * @param sellerLevel 商家等级
     */
    public void setSellerLevel(Byte sellerLevel) {
        this.sellerLevel = sellerLevel;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取审核状态
     *
     * @return audit_status - 审核状态
     */
    public Boolean getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态
     *
     * @param auditStatus 审核状态
     */
    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取实名认证状态
     *
     * @return real_status - 实名认证状态
     */
    public Boolean getRealStatus() {
        return realStatus;
    }

    /**
     * 设置实名认证状态
     *
     * @param realStatus 实名认证状态
     */
    public void setRealStatus(Boolean realStatus) {
        this.realStatus = realStatus;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
}