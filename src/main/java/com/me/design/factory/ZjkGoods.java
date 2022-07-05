package com.me.design.factory;

import com.me.vo.Goods;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ZjkGoods extends Goods {
    @Override
    public void getMsg() {
        log.info("zjk....");
    }
}
