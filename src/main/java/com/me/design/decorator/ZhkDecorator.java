package com.me.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class ZhkDecorator extends AbstractDecorator{

    public ZhkDecorator(AbrastractGoods abrastractGoods) {
        super(abrastractGoods);
    }

    @Override
    public void initGoods() {
        abrastractGoods.initGoods();
        log.info("组合修饰。。。。");
    }
}
