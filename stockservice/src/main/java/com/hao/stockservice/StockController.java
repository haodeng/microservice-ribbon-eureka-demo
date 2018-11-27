package com.hao.stockservice;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

@RestController
@Validated
public class StockController {

    @GetMapping("/api/stock/{code}")
    public StockQuote getQuote(@PathVariable
                          @Size(min=6, max=6, message = "The code length must be 6.")
                          String code){
        return new StockQuote(code, 50.5, 60.98, null);
    }
}