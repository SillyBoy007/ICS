package com.wxy.ics.common.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wxy
 * @date 2019/03/22
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class UserInfoVO implements Serializable {
    private String nikeName;
    private String openId;
    private String userImg;
}
