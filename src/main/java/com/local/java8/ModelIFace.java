package com.local.java8;

public interface ModelIFace {
    public static final String var0 = "default";
    public static void defaultMethod() {
        System.out.println("execute default method");
    }

//    public void method0() {
//        System.out.println("execute method0");
//    }

    //default关键字声明该方法为interface的默认方法，java8新特性，接口可以有接口实现
    default void method1() {
        System.out.println("execute method1");
    }
}
