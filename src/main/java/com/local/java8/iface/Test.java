package com.local.java8.iface;

import com.local.java8.iface.Defaulable.DefaulableImpl;
import com.local.java8.iface.Defaulable.OverridenDefaulable;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Defaulable defaulable = DefaulableFactory.create(DefaulableImpl::new);
        System.out.println(defaulable.defaultMethod());

        Defaulable defaulable1 = DefaulableFactory.create(OverridenDefaulable::new);
        System.out.println(defaulable1.defaultMethod());

//        Consumer
    }
}
