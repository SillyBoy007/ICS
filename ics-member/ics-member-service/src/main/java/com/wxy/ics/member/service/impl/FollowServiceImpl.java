package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.FollowPO;
import com.wxy.ics.member.dao.mapper.BaseFollowMapper;
import com.wxy.ics.member.service.IFollowService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class FollowServiceImpl extends ServiceImpl<BaseFollowMapper, FollowPO> implements IFollowService {

}
