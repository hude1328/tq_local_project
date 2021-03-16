package com.local.designpattern.observer;

import java.util.Date;
import java.util.Observable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsOrder extends Observable {

    private String orderId;
    private String orderType;
    private String orderStatus;

    public void completeOrderHandler() {
        if (orderStatus.equals("completed")) {
            System.out.println(String.format("orderId为%s的订单完成创建", orderId));
            setChanged();
            notifyObservers(new Date(System.currentTimeMillis()));
        }
    }
}
