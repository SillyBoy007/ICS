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
 * 好友表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("friends")
public class FriendsPO extends Model<FriendsPO> {

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
     * 好友用户编号
     */
    private Long friendUserCode;

    /**
     * 好友买家编号
     */
    private Long friendBuyerCode;

    /**
     * 好友商家编号
     */
    private Long friendSellerCode;

    /**
     * 好友备注
     */
    private String friendRemark;

    /**
     * 好友昵称
     */
    private String friendNikeName;

    /**
     * 好友头像
     */
    private String friendAvator;

    /**
     * 拼音简称
     */
    private String shortName;

    /**
     * 拼音首字母
     */
    private String firstName;

    /**
     * 好友状态
     */
    private Integer status;

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
     * 手机号
     */
    private String mobile;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
