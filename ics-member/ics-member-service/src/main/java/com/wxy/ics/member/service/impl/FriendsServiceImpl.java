package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.FriendsPO;
import com.wxy.ics.member.dao.mapper.BaseFriendsMapper;
import com.wxy.ics.member.service.IFriendsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 好友表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class FriendsServiceImpl extends ServiceImpl<BaseFriendsMapper, FriendsPO> implements IFriendsService {

}
