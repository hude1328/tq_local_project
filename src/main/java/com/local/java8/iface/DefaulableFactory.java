package com.local.java8.iface;

import java.util.function.Supplier;

public interface DefaulableFactory {

    static Defaulable create(Supplier<Defaulable> supplier) {
        return supplier.get();
    }
}
