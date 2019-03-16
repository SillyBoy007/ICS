package com.wxy.ics.stub.common.domain;

import java.util.Date;

public class Member {
    /**
     * 自增主键
     */

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户的标识，对当前公众号唯一
     */
    private String openId;

    /**
     * 联合union_id
     */
    private Long unionId;

    /**
     * 1.h5商城 2.今日断码
     */
    private Integer type;

    /**
     * 用户第三方标识
     */
    private String thirdPartyId;

    /**
     * 1.有效 2冻结 
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 0:未删除，1已删除
     */
    private Boolean isDelete;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户的标识，对当前公众号唯一
     *
     * @return open_id - 用户的标识，对当前公众号唯一
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户的标识，对当前公众号唯一
     *
     * @param openId 用户的标识，对当前公众号唯一
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取联合union_id
     *
     * @return union_id - 联合union_id
     */
    public Long getUnionId() {
        return unionId;
    }

    /**
     * 设置联合union_id
     *
     * @param unionId 联合union_id
     */
    public void setUnionId(Long unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取1.h5商城 2.今日断码
     *
     * @return type - 1.h5商城 2.今日断码
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1.h5商城 2.今日断码
     *
     * @param type 1.h5商城 2.今日断码
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户第三方标识
     *
     * @return third_party_id - 用户第三方标识
     */
    public String getThirdPartyId() {
        return thirdPartyId;
    }

    /**
     * 设置用户第三方标识
     *
     * @param thirdPartyId 用户第三方标识
     */
    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId == null ? null : thirdPartyId.trim();
    }

    /**
     * 获取1.有效 2冻结 
     *
     * @return status - 1.有效 2冻结 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1.有效 2冻结 
     *
     * @param status 1.有效 2冻结 
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取修改人
     *
     * @return update_by - 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改人
     *
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取0:未删除，1已删除
     *
     * @return is_delete - 0:未删除，1已删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0:未删除，1已删除
     *
     * @param isDelete 0:未删除，1已删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}