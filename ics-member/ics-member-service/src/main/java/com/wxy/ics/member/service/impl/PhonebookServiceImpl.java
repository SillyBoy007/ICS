package com.wxy.ics.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy.ics.member.dao.entity.PhonebookPO;
import com.wxy.ics.member.dao.mapper.BasePhonebookMapper;
import com.wxy.ics.member.service.IPhonebookService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通讯录表 服务实现类
 * </p>
 *
 * @author wangxiayun
 * @since 2019-04-20
 */
@Service
public class PhonebookServiceImpl extends ServiceImpl<BasePhonebookMapper, PhonebookPO> implements IPhonebookService {

}
