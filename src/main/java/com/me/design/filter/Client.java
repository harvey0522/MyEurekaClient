package com.me.design.filter;

import com.me.vo.Goods;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        Goods goods=Goods.builder()
                    .name("goods1")
                .color("red")
                .price(new BigDecimal(81))
                .build();

        PriceFilter filter3=new BeanPriceFilter(null);
        PriceFilter filter2=new CouponPriceFilter(filter3);
        PriceFilter filter1=new LogisPriceFilter(filter2);
        filter1.count(goods);

    }
}
