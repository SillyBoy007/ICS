package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.StoreFansPO;
import com.wxy.ics.member.dao.mapper.BaseStoreFansMapper;
import com.wxy.ics.member.service.IStoreFansService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺粉丝表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class StoreFansServiceImpl extends ServiceImpl<BaseStoreFansMapper, StoreFansPO> implements IStoreFansService {

}
