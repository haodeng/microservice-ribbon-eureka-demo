package com.hao.orderservice;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

public class Order {
    private long id;

    @NotNull
    @Positive
    private Double price;

    @NotNull
    @Positive
    private Long amount;

    @NotNull
    private String buyOrSell;

    @NotNull
    private String code;

    private Date createdDate;
    private String status;


    public Order() {
        super();
    }

    public Order(Double price, Long amount, String buyOrSell, String code) {
        this.price = price;
        this.amount = amount;
        this.buyOrSell = buyOrSell;
        this.code = code;
    }

    public Order(long id, Double price, Long amount, String buyOrSell, Date createdDate, String code, String status) {
        this.id = id;
        this.price = price;
        this.amount = amount;
        this.buyOrSell = buyOrSell;
        this.code = code;
        this.createdDate = createdDate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(String buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}