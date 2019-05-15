package com.example.multithreading.countdownLatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {

   public static void main(String args[]) throws InterruptedException {

       CountDownLatch latch = new CountDownLatch(3);

       ExecutorService executor = Executors.newFixedThreadPool(3);

       for(int i = 0; i < 3 ; i++){
        executor.submit(new Processor(latch));
       }

      latch.await();

      System.out.println("completed");
   }

}