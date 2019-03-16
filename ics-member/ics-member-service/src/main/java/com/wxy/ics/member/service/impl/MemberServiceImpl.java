package com.wxy.ics.member.service.impl;

import com.wxy.ics.member.common.service.impl.BaseService;
import com.wxy.ics.member.domain.Member;
import com.wxy.ics.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("memberService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MemberServiceImpl extends BaseService<Member> implements MemberService {
}
