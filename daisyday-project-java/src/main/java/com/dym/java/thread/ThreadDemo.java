package com.dym.java.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    /**
     * 创建线程有四种方式：
     * 继承 Thread 类；
     * 实现 Runnable 接口；
     * 实现 Callable 接口；
     * 使用 Executors 工具类创建线程池
     */



    public static void main(String[] args) {
//        Thread thread= new Thread(){
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " run()方法正在执行...");
//            }
//        };
//        thread.run();

        MyThread myThread1= new MyThread();
        myThread1.start();

//        Runnable runnable = new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " run()方法正在执行...");
//            }
//        };
//        runnable.run();

        MyRunnable myRunnable=new MyRunnable();
        Thread thread002 = new Thread(myRunnable);
        thread002.start();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println("返回结果 " + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " main()方法执行完成");




        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyRunnable runnableTest = new MyRunnable();
        for (int i = 0; i < 5; i++) {
            executorService.execute(runnableTest);
        }

        System.out.println("线程任务开始执行");
        executorService.shutdown();
    }







}
