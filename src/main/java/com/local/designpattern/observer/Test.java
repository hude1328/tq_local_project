package com.local.designpattern.observer;

public class Test {

    public static void main(String[] args) {
        GoodsOrder order1 = new GoodsOrder("001", "vip", "completed");
        GoodsOrder order2 = new GoodsOrder("002", "sendCoupon", "completed");

        AddGoodsHandlerObserver addGoodsHandlerObserver = new AddGoodsHandlerObserver();
        VipScoreHandlerObserver vipScoreHandlerObserver = new VipScoreHandlerObserver();
        SendCouponHandlerObserver sendCouponHandlerObserver = new SendCouponHandlerObserver();

        order1.addObserver(addGoodsHandlerObserver);
        order1.addObserver(vipScoreHandlerObserver);
        order1.addObserver(sendCouponHandlerObserver);

        order2.addObserver(addGoodsHandlerObserver);
        order2.addObserver(vipScoreHandlerObserver);
        order2.addObserver(sendCouponHandlerObserver);

        order1.completeOrderHandler();
        System.out.println("===========================");
        order2.completeOrderHandler();


    }

}
