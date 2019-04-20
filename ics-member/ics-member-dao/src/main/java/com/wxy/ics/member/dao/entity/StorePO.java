package com.wxy.ics.member.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 店铺表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("store")
public class StorePO extends Model<StorePO> {

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除
     */
    private Boolean isDelete;

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
     * 商家编号
     */
    private Long sellerCode;

    /**
     * 店铺编号
     */
    private Long storeCode;

    /**
     * 店铺类型
     */
    @TableField("verifiedType")
    private Integer verifiedType;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺地址
     */
    private String storeAdress;

    /**
     * 店铺logo
     */
    private String storeLogo;

    /**
     * 主营类目
     */
    private String mainCategory;

    /**
     * 店铺简介
     */
    private String introduction;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
