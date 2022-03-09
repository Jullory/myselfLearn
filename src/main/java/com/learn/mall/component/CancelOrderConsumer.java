package com.learn.mall.component;

import com.learn.mall.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 取消订单消息的消费者
 */
@Component
@RabbitListener(queues =  "mall.order.cancel")
public class CancelOrderConsumer {
    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderConsumer.class);

    @Autowired
    private OmsPortalOrderService portalOrderService;

    public void handle(Long orderId){
        LOGGER.info("receive delay message orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }
}
