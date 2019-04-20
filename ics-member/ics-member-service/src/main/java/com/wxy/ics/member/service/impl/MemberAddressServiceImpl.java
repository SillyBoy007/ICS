package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.MemberAddressPO;
import com.wxy.ics.member.dao.mapper.BaseMemberAddressMapper;
import com.wxy.ics.member.service.IMemberAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户地址表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class MemberAddressServiceImpl extends ServiceImpl<BaseMemberAddressMapper, MemberAddressPO> implements IMemberAddressService {

}
