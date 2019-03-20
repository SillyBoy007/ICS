package com.wxy.ics.member.controller;

import com.wxy.ics.common.enums.CodeMsg;
import com.wxy.ics.member.common.controller.BaseController;
import com.wxy.ics.member.po.SellerPO;
import com.wxy.ics.member.service.SellerService;
import entity.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SellerController
 * @author wxy
 * @date 2019/03/18
 */
@RestController
public class SellerController extends BaseController{
    @Autowired
    SellerService sellerService;
    public ReturnResult<List<SellerPO>>  selectSellerList(){
        List<SellerPO> sellers = sellerService.selectAll();
        return ReturnResult.successMsg(CodeMsg.SUCCESS.getKey(),CodeMsg.SUCCESS.getMessage(),sellers);
    }
}
