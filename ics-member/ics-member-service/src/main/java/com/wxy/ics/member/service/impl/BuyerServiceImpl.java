package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.BuyerPO;
import com.wxy.ics.member.dao.mapper.BaseBuyerMapper;
import com.wxy.ics.member.service.IBuyerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 买家表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class BuyerServiceImpl extends ServiceImpl<BaseBuyerMapper, BuyerPO> implements IBuyerService {

}
