package com.stan.event.service;

import com.stan.event.event.OrderStartEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements ApplicationListener<OrderStartEvent> {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(OrderStartEvent orderStartEvent) {

        logger.info("监听到订单{}正在{}，正在给用户通知发短信...", orderStartEvent.getOderId(),orderStartEvent.getAction());
    }
}
