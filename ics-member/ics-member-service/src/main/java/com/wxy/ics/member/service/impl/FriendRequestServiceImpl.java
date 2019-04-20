package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.FriendRequestPO;
import com.wxy.ics.member.dao.mapper.BaseFriendRequestMapper;
import com.wxy.ics.member.service.IFriendRequestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 好友申请表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class FriendRequestServiceImpl extends ServiceImpl<BaseFriendRequestMapper, FriendRequestPO> implements IFriendRequestService {

}
