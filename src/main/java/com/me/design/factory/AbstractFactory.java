package com.me.design.factory;

public abstract class AbstractFactory<A> {
    public abstract A createObj(Class<A> tClass);
}
