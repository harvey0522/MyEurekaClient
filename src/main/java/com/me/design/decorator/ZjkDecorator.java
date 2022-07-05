package com.me.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class ZjkDecorator extends AbstractDecorator{

    public ZjkDecorator(AbrastractGoods abrastractGoods) {
        super(abrastractGoods);
    }

    @Override
    public void initGoods() {
        abrastractGoods.initGoods();
        log.info("正价修饰。。。。");
    }
}
