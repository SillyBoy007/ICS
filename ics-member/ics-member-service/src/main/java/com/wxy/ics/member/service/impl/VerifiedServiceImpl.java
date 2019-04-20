package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.VerifiedPO;
import com.wxy.ics.member.dao.mapper.BaseVerifiedMapper;
import com.wxy.ics.member.service.IVerifiedService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 实名认证表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class VerifiedServiceImpl extends ServiceImpl<BaseVerifiedMapper, VerifiedPO> implements IVerifiedService {

}
