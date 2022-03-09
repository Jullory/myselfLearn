package com.learn.mall.service;

import com.learn.mall.common.api.CommonResponse;
import com.learn.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     * @param orderParam 订单信息
     * @return 订单
     */
    @Transactional
    CommonResponse generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     * @param orderId 订单ID
     */
    @Transactional
    void cancelOrder(Long orderId);

}
