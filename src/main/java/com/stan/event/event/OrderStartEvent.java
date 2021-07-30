package com.stan.event.event;

import org.springframework.context.ApplicationEvent;

/**
 * 订单开始事件
 */
public class OrderStartEvent extends ApplicationEvent {
    private String oderId;
    private String action;

    public OrderStartEvent(Object source) {
        super(source);
    }


    public OrderStartEvent(Object source, String oderId) {
        super(source);
        this.oderId = oderId;
    }

    public OrderStartEvent(Object source, String oderId, String action) {
        super(source);
        this.oderId = oderId;
        this.action = action;
    }

    public String getOderId() {
        return oderId;
    }

    public String getAction() {
        return action;
    }
}
