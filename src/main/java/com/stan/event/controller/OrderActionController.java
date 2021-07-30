package com.stan.event.controller;

import com.stan.event.service.OrderActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderAction")
public class OrderActionController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderActionService orderActionService;

    @GetMapping("/start")
    public String startOrder() {
        orderActionService.orderStart("FY00050139007030001","派送");
        return "订单派送成功";
    }
    @GetMapping("/sign")
    public String signOrder() {
        orderActionService.orderStart("FY00050139007030001","签收");
        return "订单签收成功";
    }
}
