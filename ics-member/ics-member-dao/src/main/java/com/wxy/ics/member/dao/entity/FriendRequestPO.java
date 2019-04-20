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
 * 好友申请表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("friend_request")
public class FriendRequestPO extends Model<FriendRequestPO> {

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
     * 被添加用户编码
     */
    private Long userCode;

    /**
     * 申请用户编号
     */
    private Long requestUserCode;

    /**
     * 申请用户名
     */
    private String requestUserName;

    /**
     * 申请用户头像
     */
    private String requestUserAvator;

    /**
     * 好友备注
     */
    private String friendRemark;

    /**
     * 申请文字
     */
    private String content;

    /**
     * 状态 0-申请 1-同意 2-拒绝 
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
