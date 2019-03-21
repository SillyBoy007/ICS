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
     * 买家编号
     */
    @Column(name = "buyer_code")
    private String buyerCode;

    /**
     * 商家编号
     */
    @Column(name = "seller_code")
    private String sellerCode;

    /**
     * 账户类型
     */
    @Column(name = "account_type")
    private Boolean accountType;

    /**
     * 账户id
     */
    @Column(name = "account_id")
    private String accountId;

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
     * 获取买家编号
     *
     * @return buyer_code - 买家编号
     */
    public String getBuyerCode() {
        return buyerCode;
    }

    /**
     * 设置买家编号
     *
     * @param buyerCode 买家编号
     */
    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode == null ? null : buyerCode.trim();
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
     * 获取账户类型
     *
     * @return account_type - 账户类型
     */
    public Boolean getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型
     *
     * @param accountType 账户类型
     */
    public void setAccountType(Boolean accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取账户id
     *
     * @return account_id - 账户id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户id
     *
     * @param accountId 账户id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
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