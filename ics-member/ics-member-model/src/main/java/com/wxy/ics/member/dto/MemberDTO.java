package com.wxy.ics.member.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class MemberDTO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 渠道
     */
    private Long channel;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号",  notes = "用户编号")
    private Long userCode;

    /**
     * 用户状态
     */
    private Integer userStatus;

    /**
     * 邀请人
     */
    private String inviteUserId;

    /**
     * 最后登录时间
     */
    private Date loginTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "用户昵称",  notes = "用户昵称")
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
    private Boolean isSeller;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
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
    private String interestBrand;

    /**
     * 感兴趣的品类
     */
    private String interestCategory;

    /**
     * 简介
     */
    private String introduction;


}