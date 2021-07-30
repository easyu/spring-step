package com.stan.event.service;

import com.stan.event.event.OrderStartEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class OrderActionService implements ApplicationEventPublisherAware {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void orderStart(String orderId,String acitonName) {
        logger.info("订单{}开始{}....", orderId,acitonName);
        applicationEventPublisher.publishEvent(new OrderStartEvent(this, orderId,acitonName));
    }
}
