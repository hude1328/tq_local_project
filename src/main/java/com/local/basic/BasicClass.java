package com.local.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BasicClass {

    public static void main(String[] args) {

        Objects.equals("1", "2");

//        //用Collections.emptyList()返回的list是一个抽象列表，并非java.utils.List，且有final static 修饰，add方法也是抽象方法。
//        List<Double> result = Collections.emptyList();
//        result.add(12.1);
//        result.add(13.22);
//        System.out.println(result.toString());
//
//        //创建线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.submit(createRun(result));

        //java8 list to map
//        Person a = new Person("a", 1, true);
//        Person b = new Person("b", 2, true);
//        Person c = new Person("c", 3, false);
//        List<Person> list = Arrays.asList(a, b, c);

        List<Person> list = new ArrayList<>();
        Person c = new Person();
        c.setName("c");
        c.setMale(true);
        list.add(c);
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(map.toString());

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Person {
        String name;
        Integer age;
        boolean isMale;

        static Person PersonConstructor(String name, int age, boolean isMale) {
            return new Person(name, age, isMale);
        }
    }

}
