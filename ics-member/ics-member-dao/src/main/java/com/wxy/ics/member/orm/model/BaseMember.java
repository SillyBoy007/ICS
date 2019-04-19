package com.wxy.ics.member.orm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "member")
public class BaseMember {
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
     * 用户状态
     */
    @Column(name = "user_status")
    private Integer userStatus;

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
     * 昵称
     */
    @Column(name = "nike_name")
    private String nikeName;

    /**
     * 头像
     */
    private String avator;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 是否商家
     */
    @Column(name = "is_seller")
    private Boolean isSeller;

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
     * 邮箱
     */
    private String email;

    /**
     * 地区
     */
    private String area;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 体重
     */
    private Integer weight;

    /**
     * 感兴趣的品牌
     */
    @Column(name = "interest_brand")
    private String interestBrand;

    /**
     * 感兴趣的品类
     */
    @Column(name = "interest_category")
    private String interestCategory;

    /**
     * 简介
     */
    private String introduction;

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
     * 获取用户状态
     *
     * @return user_status - 用户状态
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态
     *
     * @param userStatus 用户状态
     */
    public void setUserStatus(Integer userStatus) {
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
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取是否商家
     *
     * @return is_seller - 是否商家
     */
    public Boolean getIsSeller() {
        return isSeller;
    }

    /**
     * 设置是否商家
     *
     * @param isSeller 是否商家
     */
    public void setIsSeller(Boolean isSeller) {
        this.isSeller = isSeller;
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
     * 获取地区
     *
     * @return area - 地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地区
     *
     * @param area 地区
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取身高
     *
     * @return height - 身高
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 设置身高
     *
     * @param height 身高
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 获取体重
     *
     * @return weight - 体重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取感兴趣的品牌
     *
     * @return interest_brand - 感兴趣的品牌
     */
    public String getInterestBrand() {
        return interestBrand;
    }

    /**
     * 设置感兴趣的品牌
     *
     * @param interestBrand 感兴趣的品牌
     */
    public void setInterestBrand(String interestBrand) {
        this.interestBrand = interestBrand == null ? null : interestBrand.trim();
    }

    /**
     * 获取感兴趣的品类
     *
     * @return interest_category - 感兴趣的品类
     */
    public String getInterestCategory() {
        return interestCategory;
    }

    /**
     * 设置感兴趣的品类
     *
     * @param interestCategory 感兴趣的品类
     */
    public void setInterestCategory(String interestCategory) {
        this.interestCategory = interestCategory == null ? null : interestCategory.trim();
    }

    /**
     * 获取简介
     *
     * @return introduction - 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置简介
     *
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}