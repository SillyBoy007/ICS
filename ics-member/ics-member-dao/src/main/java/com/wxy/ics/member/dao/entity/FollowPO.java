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
 * 关注表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("follow")
public class FollowPO extends Model<FollowPO> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 渠道
     */
    private Long channel;

    /**
     * 用户编码
     */
    private Long userCode;

    /**
     * 店铺编码
     */
    private Long storeCode;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺logo
     */
    private String storeLogo;

    /**
     * 商家编码
     */
    private Long sellerCode;

    /**
     * 店铺店主的用户编码
     */
    private Long followUserCode;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 是否关注
     */
    private Boolean isBoth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
