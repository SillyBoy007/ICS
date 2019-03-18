package com.wxy.ics.member.service.impl;

import com.wxy.ics.member.common.service.impl.BaseServiceImpl;
import com.wxy.ics.member.domain.Seller;
import com.wxy.ics.member.service.SellerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * SellerServiceImpl
 * @author wxy
 * @date 2019/03/18
 */
@Service("sellerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class SellerServiceImpl extends BaseServiceImpl<Seller> implements SellerService{

}
