package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.StorePO;
import com.wxy.ics.member.dao.mapper.BaseStoreMapper;
import com.wxy.ics.member.service.IStoreService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class StoreServiceImpl extends ServiceImpl<BaseStoreMapper, StorePO> implements IStoreService {

}
