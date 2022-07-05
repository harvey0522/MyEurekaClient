package com.me.design.filter;

import com.me.vo.Goods;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class LogisPriceFilter implements PriceFilter{

    private PriceFilter priceFilter;

    public LogisPriceFilter(PriceFilter priceFilter){
        this.priceFilter=priceFilter;
    }

    @Override
    public void count(Goods goods){
        log.info("goods:{}",goods);
        BigDecimal current = goods.getPrice().add(new BigDecimal(10));
        log.info("物流费用后:{}",current);
        goods.setPrice(current);
        priceFilter.count(goods);
    }
}
