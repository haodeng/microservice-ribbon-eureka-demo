package com.hao.orderservice;

import com.hao.stockservice.StockQuote;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hao-stock-service")
@RibbonClient(name="hao-stock-service")
public interface StockServiceProxy {

    @GetMapping("/api/stock/{code}")
    public StockQuote getQuote(@PathVariable("code") String code);
}