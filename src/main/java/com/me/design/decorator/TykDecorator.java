package com.me.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class TykDecorator extends AbstractDecorator{

    public TykDecorator(AbrastractGoods abrastractGoods) {
        super(abrastractGoods);
    }

    @Override
    public void initGoods() {
        abrastractGoods.initGoods();
        log.info("体验修饰。。。。");
    }
}
