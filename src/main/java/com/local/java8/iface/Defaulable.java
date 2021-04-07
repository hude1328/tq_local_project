package com.local.java8.iface;

public interface Defaulable {

    default String defaultMethod() {
        return "default impl";
    }

    public class DefaulableImpl implements Defaulable {
    }

    public class OverridenDefaulable implements Defaulable {
        @Override
        public String defaultMethod() {
            return "override default impl";
        }
    }
}
