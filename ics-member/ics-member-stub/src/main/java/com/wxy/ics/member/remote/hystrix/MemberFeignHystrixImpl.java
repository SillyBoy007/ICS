package com.wxy.ics.member.remote.hystrix;

import com.wxy.ics.member.dto.MemberDTO;
import com.wxy.ics.member.remote.MemberFeignService;
import com.wxy.ics.member.vo.MemberVO;
import com.wxy.ics.member.vo.ReturnResultVO;
import org.springframework.stereotype.Component;

import static com.wxy.ics.member.common.enums.StatusEnum.*;

/**
 * @author wangxiayun
 * @since 2019-04-12
 */
@Component
public class MemberFeignHystrixImpl implements MemberFeignService {
    @Override
    public ReturnResultVO<MemberVO> getMemberById(Long id) {
        return ReturnResultVO.error(CONNECT_TIMEOUT.getCode(),CONNECT_TIMEOUT.getMsg());
    }

    @Override
    public ReturnResultVO<Void> addMember(MemberDTO memberDTO) {
        return ReturnResultVO.error(CONNECT_TIMEOUT.getCode(),CONNECT_TIMEOUT.getMsg());
    }
}
