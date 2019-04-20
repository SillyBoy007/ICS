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
 * 店铺粉丝表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("store_fans")
public class StoreFansPO extends Model<StoreFansPO> {

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
     * 店铺商家的用户编码
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
     * 店铺编码
     */
    private Long storeCode;

    /**
     * 商家编码
     */
    private Long sellerCode;

    /**
     * 会员编码
     */
    private Long fanUserCode;

    /**
     * 粉丝昵称
     */
    private String fanNikeName;

    /**
     * 粉丝头像
     */
    private String fanAvator;

    /**
     * 是否相互关注
     */
    private Boolean isBoth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
