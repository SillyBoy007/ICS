package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.LoginMobilePO;
import com.wxy.ics.member.dao.mapper.BaseLoginMobileMapper;
import com.wxy.ics.member.service.ILoginMobileService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 手机登陆账户表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class LoginMobileServiceImpl extends ServiceImpl<BaseLoginMobileMapper, LoginMobilePO> implements ILoginMobileService {

}
