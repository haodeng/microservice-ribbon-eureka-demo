package com.hao.orderservice;

import com.hao.stockservice.StockQuote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

@RestController
public class OrderServiceController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockServiceProxy proxy;

    @PostMapping(value = "/api/order")
    public Order createOrder(@Valid @RequestBody Order order){
        StockQuote quote = proxy.getQuote(order.getCode());

        logger.info("{}", quote);

        return new Order(5L, order.getPrice(), order.getAmount(),
                order.getBuyOrSell(), new Date(), order.getCode(), "Pending");
    }
}