package com.me.vo;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Builder
@ToString
@Slf4j
public  class Goods {

    private String no;

    private String name;

    private String color;

    private String attr;

    private BigDecimal price;

    public Goods(){

    }

    public Goods(String no, String name, String color, String attr, BigDecimal price) {
        this.no = no;
        this.name = name;
        this.color = color;
        this.attr = attr;
        this.price = price;
    }

    public void getMsg(){
        log.info("common goods");
    }

}
