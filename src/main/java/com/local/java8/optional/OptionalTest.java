package com.local.java8.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) throws Exception {
        //用Optional容器来避免NPE
        String s1 = "s1";
        Optional<String> s = Optional.ofNullable(s1);
        if (s.isPresent()) {
            String s2 = s.get();
        }

        /**
         * ofNullable方法可以接收一个空对象
         * orElse()方法：当optional实例持有null时，返回传入的默认值
         * orElseGet(): 当optional实例持有null时，可以接受一个lambda表达式生成的默认值
         * map(): 将现有的Optional实例的值转换成新的值
         */
        String s3 = Optional.ofNullable(s1).orElse("null");
        String s4 = Optional.ofNullable(s1).orElseGet(String::new);
        String s5 = Optional.ofNullable(s1).orElseThrow(Exception::new);
        String s6 = Optional.of(s1).orElse("s6");
        String s7 = Optional.ofNullable(s1).map(a -> a+" after optional map").orElse("");
    }
}
