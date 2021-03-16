package com.local.designpattern.observer;

import java.util.Observer;

public interface GoodsOrderObserver extends Observer {

    boolean filter(GoodsOrder goodsOrder);

    void doSyncTask(GoodsOrder goodsOrder);

    void doAsyncTask(GoodsOrder goodsOrder);

}