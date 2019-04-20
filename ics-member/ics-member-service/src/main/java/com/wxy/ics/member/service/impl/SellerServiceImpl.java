package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.SellerPO;
import com.wxy.ics.member.dao.mapper.BaseSellerMapper;
import com.wxy.ics.member.service.ISellerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 卖家表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class SellerServiceImpl extends ServiceImpl<BaseSellerMapper, SellerPO> implements ISellerService {

}
