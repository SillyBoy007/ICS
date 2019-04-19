package com.wxy.ics.member.orm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "buyer")
public class BaseBuyer {
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
     * 买家编号
     */
    @Column(name = "buyer_code")
    private Long buyerCode;

    /**
     * 买家类型
     */
    @Column(name = "buyer_type")
    private Boolean buyerType;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 会员状态
     */
    @Column(name = "member_status")
    private Integer memberStatus;

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
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

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
     * 获取买家编号
     *
     * @return buyer_code - 买家编号
     */
    public Long getBuyerCode() {
        return buyerCode;
    }

    /**
     * 设置买家编号
     *
     * @param buyerCode 买家编号
     */
    public void setBuyerCode(Long buyerCode) {
        this.buyerCode = buyerCode;
    }

    /**
     * 获取买家类型
     *
     * @return buyer_type - 买家类型
     */
    public Boolean getBuyerType() {
        return buyerType;
    }

    /**
     * 设置买家类型
     *
     * @param buyerType 买家类型
     */
    public void setBuyerType(Boolean buyerType) {
        this.buyerType = buyerType;
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
     * 获取会员状态
     *
     * @return member_status - 会员状态
     */
    public Integer getMemberStatus() {
        return memberStatus;
    }

    /**
     * 设置会员状态
     *
     * @param memberStatus 会员状态
     */
    public void setMemberStatus(Integer memberStatus) {
        this.memberStatus = memberStatus;
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
}