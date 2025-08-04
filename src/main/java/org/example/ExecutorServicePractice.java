package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicePractice {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<?> check1=executorService.submit(()->{for(int i = 1; i<=100; i++){
            if(i%2!=0)
                System.out.println(i);
        }
        });
        Future<?> check2=executorService.submit(()->{for(int i=1;i<=100;i++){
            if(i%2==0)
                System.out.println(i);
        }
        });
        check1.get();
        check2.get();
        executorService.shutdown();
        System.out.println("hello");
    }
}
