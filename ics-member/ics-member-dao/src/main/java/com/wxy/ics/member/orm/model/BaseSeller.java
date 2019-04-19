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
     * 渠道
     */
    private Long channel;

    /**
     * 用户编号
     */
    @Column(name = "user_code")
    private Long userCode;

    /**
     * 商家编号
     */
    @Column(name = "seller_code")
    private Long sellerCode;

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
     * 审核状态
     */
    @Column(name = "audit_status")
    private Integer auditStatus;

    /**
     * 实名认证状态
     */
    @Column(name = "real_status")
    private Integer realStatus;

    /**
     * 商家状态
     */
    @Column(name = "seller_status")
    private Integer sellerStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

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
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

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
    public Long getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(Long channel) {
        this.channel = channel;
    }

    /**
     * 获取用户编号
     *
     * @return user_code - 用户编号
     */
    public Long getUserCode() {
        return userCode;
    }

    /**
     * 设置用户编号
     *
     * @param userCode 用户编号
     */
    public void setUserCode(Long userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取商家编号
     *
     * @return seller_code - 商家编号
     */
    public Long getSellerCode() {
        return sellerCode;
    }

    /**
     * 设置商家编号
     *
     * @param sellerCode 商家编号
     */
    public void setSellerCode(Long sellerCode) {
        this.sellerCode = sellerCode;
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
     * 获取审核状态
     *
     * @return audit_status - 审核状态
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态
     *
     * @param auditStatus 审核状态
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取实名认证状态
     *
     * @return real_status - 实名认证状态
     */
    public Integer getRealStatus() {
        return realStatus;
    }

    /**
     * 设置实名认证状态
     *
     * @param realStatus 实名认证状态
     */
    public void setRealStatus(Integer realStatus) {
        this.realStatus = realStatus;
    }

    /**
     * 获取商家状态
     *
     * @return seller_status - 商家状态
     */
    public Integer getSellerStatus() {
        return sellerStatus;
    }

    /**
     * 设置商家状态
     *
     * @param sellerStatus 商家状态
     */
    public void setSellerStatus(Integer sellerStatus) {
        this.sellerStatus = sellerStatus;
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
}