package com.wxy.ics.member.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 卖家表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("seller")
public class SellerPO extends Model<SellerPO> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 渠道
     */
    private Long channel;

    /**
     * 用户编号
     */
    private Long userCode;

    /**
     * 商家编号
     */
    private Long sellerCode;

    /**
     * 商家等级
     */
    private Integer sellerLevel;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 审核状态
     */
    private Integer auditStatus;

    /**
     * 实名认证状态
     */
    private Integer realStatus;

    /**
     * 商家状态
     */
    private Integer sellerStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createBy;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
