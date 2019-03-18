package com.wxy.ics.member.service.impl;

import com.wxy.ics.member.common.service.impl.BaseServiceImpl;
import com.wxy.ics.member.domain.Test;
import com.wxy.ics.member.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *TestServiceImpl
 * @author wxy
 * @date 2019/03/14
 */
@Service("testService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class TestServiceImpl extends BaseServiceImpl<Test> implements TestService {

}
