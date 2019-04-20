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
 * 通讯录表
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("phonebook")
public class PhonebookPO extends Model<PhonebookPO> {

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
     * 通讯录上传设备id
     */
    private String deviceId;

    /**
     * 好友用户编码
     */
    private Long friendUserCode;

    /**
     * 好友手机
     */
    private String friendMobile;

    /**
     * 拼音简称
     */
    private String shortName;

    /**
     * 拼音首字母
     */
    private String firstName;

    /**
     * 好友头像
     */
    private String friendAvator;

    /**
     * 好友昵称
     */
    private String friendNikeName;

    /**
     * 好友备注
     */
    private String friendRemark;

    /**
     * 是否好友关系
     */
    private Boolean isFriend;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
