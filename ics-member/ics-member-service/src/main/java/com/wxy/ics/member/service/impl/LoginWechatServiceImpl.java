package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.LoginWechatPO;
import com.wxy.ics.member.dao.mapper.BaseLoginWechatMapper;
import com.wxy.ics.member.service.ILoginWechatService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信登陆账户表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class LoginWechatServiceImpl extends ServiceImpl<BaseLoginWechatMapper, LoginWechatPO> implements ILoginWechatService {

}
