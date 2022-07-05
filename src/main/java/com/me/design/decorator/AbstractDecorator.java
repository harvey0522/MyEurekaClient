package com.me.design.decorator;

public abstract class AbstractDecorator implements  AbrastractGoods{
    protected AbrastractGoods abrastractGoods;
    public AbstractDecorator(AbrastractGoods abrastractGoods){
        this.abrastractGoods=abrastractGoods;
    }

}
