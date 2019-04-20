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
 * 买家表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("buyer")
public class BuyerPO extends Model<BuyerPO> {

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
     * 买家编号
     */
    private Long buyerCode;

    /**
     * 买家类型
     */
    private Boolean buyerType;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 会员状态
     */
    private Integer memberStatus;

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
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
