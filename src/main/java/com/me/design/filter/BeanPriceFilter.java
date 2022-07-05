package com.me.design.filter;

import com.me.vo.Goods;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BeanPriceFilter implements PriceFilter{

    private PriceFilter priceFilter;

    public BeanPriceFilter(PriceFilter priceFilter){
        this.priceFilter=priceFilter;
    }

    @Override
    public void count(Goods goods){
        BigDecimal current = goods.getPrice().subtract(new BigDecimal(4));
        log.info("虚拟豆费用后:{}",current);
        goods.setPrice(current);
        if(priceFilter!=null) {
            priceFilter.count(goods);
        }else {
            log.info("over:{}",goods);
        }
    }
}
