package com.me.design.decorator;

public class Client {
    public static void main(String[] args) {

        //goods.initGoods();
        //zjkDecorator.initGoods();

        AbrastractGoods goods=createObj();
        goods.initGoods();
    }

    public static AbrastractGoods createObj(){
        AbrastractGoods response;
        AbrastractGoods goods=new ZJKGoods();
        AbrastractGoods zjkDecorator=new ZjkDecorator(goods);
        AbrastractGoods tykDecorator=new TykDecorator(zjkDecorator);
        AbrastractGoods zhkDecorator=new ZhkDecorator(tykDecorator);
        response=zhkDecorator;
        return response;
    }
}
