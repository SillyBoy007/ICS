package com.wxy.ics.member.mapper;

import com.wxy.ics.member.domain.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    Member getMemberByOpenId(@Param("open_id") String openId);
}
