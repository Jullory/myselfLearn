package com.learn.mall.service.impl;

import com.learn.mall.common.api.CommonResponse;
import com.learn.mall.dto.OrderParam;
import com.learn.mall.service.OmsPortalOrderService;
import org.springframework.stereotype.Service;

@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService{


    @Override
    public CommonResponse generateOrder(OrderParam orderParam) {

        return null;
    }

    @Override
    public void cancelOrder(Long orderId) {

    }
}
