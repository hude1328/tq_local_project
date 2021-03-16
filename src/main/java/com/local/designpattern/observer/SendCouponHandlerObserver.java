package com.local.designpattern.observer;

import java.util.Observable;

public class SendCouponHandlerObserver implements GoodsOrderObserver {

    @Override
    public boolean filter(GoodsOrder goodsOrder) {
        return goodsOrder.getOrderType().equals("sendCoupon");
    }

    @Override
    public void doSyncTask(GoodsOrder goodsOrder) {
    }

    @Override
    public void doAsyncTask(GoodsOrder goodsOrder) {
        System.out.println(String.format("为用户发券异步操作完成， orderId:%s", goodsOrder.getOrderId()));
    }

    @Override
    public void update(Observable o, Object arg) {
        GoodsOrder goodsOrder = (GoodsOrder) o;
        String timestamp = String.valueOf(arg);
        if (filter(goodsOrder)) {
            System.out.println(String.format("%s: 开始进行下单后为满足条件用户发优惠券操作，orderId:%s", timestamp, goodsOrder.getOrderId()));
            doSyncTask(goodsOrder);
            doAsyncTask(goodsOrder);
        }
    }
}
