package com.local.concurrent.threadpool;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 20; i++) {
            Runnable run = createRun(i);
            executorService.submit(run);
        }
        executorService.shutdown();

        /*
        每隔一秒检查线程是否执行结束
         */
        while(!executorService.awaitTermination(1, TimeUnit.SECONDS)){
            System.out.println("线程还在执行。");
        }
    }

    static Runnable createRun(int threadNo) {
        return () -> System.out.println("thread" + threadNo + " is working...");
    }
}
