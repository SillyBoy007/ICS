package com.wxy.ics.member.mapper;

import com.wxy.ics.member.domain.MemberPO;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    MemberPO getMemberByOpenId(@Param("open_id") String openId);
}
