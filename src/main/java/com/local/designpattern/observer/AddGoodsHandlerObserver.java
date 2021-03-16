package com.local.designpattern.observer;

import java.util.Observable;

public class AddGoodsHandlerObserver implements GoodsOrderObserver {


    @Override
    public boolean filter(GoodsOrder goodsOrder) {
        return true;
    }

    @Override
    public void doSyncTask(GoodsOrder goodsOrder) {
        System.out.println(String.format("添加商品同步操作完成, orderId:%s", goodsOrder.getOrderId()));
    }

    @Override
    public void doAsyncTask(GoodsOrder goodsOrder) {
    }

    @Override
    public void update(Observable o, Object arg) {
        GoodsOrder goodsOrder = (GoodsOrder) o;
        String timestamp = String.valueOf(arg);
        if (filter(goodsOrder)) {
            System.out.println(String.format("%s: 开始进行下单后为用户添加商品操作，orderId:%s", timestamp, goodsOrder.getOrderId()));
            doSyncTask(goodsOrder);
            doAsyncTask(goodsOrder);
        }
    }
}
