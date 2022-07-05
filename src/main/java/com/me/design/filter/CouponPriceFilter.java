package com.me.design.filter;

import com.me.vo.Goods;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class CouponPriceFilter implements PriceFilter{

    private PriceFilter priceFilter;

    public CouponPriceFilter(PriceFilter priceFilter){
        this.priceFilter=priceFilter;
    }

    @Override
    public void count(Goods goods){
        BigDecimal current = goods.getPrice().subtract(new BigDecimal(15));
        log.info("优惠券费用后:{}",current);
        goods.setPrice(current);
        priceFilter.count(goods);
    }
}
