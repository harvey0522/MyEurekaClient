package com.me.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ZJKGoods implements AbrastractGoods{
    @Override
    public void initGoods() {
        log.info("我是正价");
    }
}
