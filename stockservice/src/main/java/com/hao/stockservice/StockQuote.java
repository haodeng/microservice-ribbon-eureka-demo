package com.hao.stockservice;

public class StockQuote {
    private String code;
    private Double open;
    private Double close;
    private Double current;

    public StockQuote(){
        super();
    }

    public StockQuote(String code, Double open, Double current, Double close) {
        this.code = code;
        this.close = close;
        this.open = open;
        this.current = current;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }
}