package com.me.design.factory;

import com.me.vo.Goods;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        AbstractFactory<GkkGoods> factory =new SimpleCourseFactory();
        Goods obj = factory.createObj(GkkGoods.class);
        obj.getMsg();
    }
}
