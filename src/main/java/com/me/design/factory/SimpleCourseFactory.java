package com.me.design.factory;

public class SimpleCourseFactory<A> extends AbstractFactory<A>{
    @Override
    public A createObj(Class<A> tClass) {
        A goods = null;
        try {
            goods = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return goods;
    }
}
