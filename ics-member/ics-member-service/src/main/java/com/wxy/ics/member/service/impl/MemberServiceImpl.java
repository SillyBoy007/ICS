package com.wxy.ics.member.service.impl;

import com.wxy.ics.member.common.service.impl.BaseServiceImpl;
import com.wxy.ics.member.po.MemberPO;
import com.wxy.ics.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *MemberServiceImpl
 * @author wxy
 * @date 2019/03/14
 */
@Service("memberService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MemberServiceImpl extends BaseServiceImpl<MemberPO> implements MemberService {
}
