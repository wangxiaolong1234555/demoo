package com.company.Demo04;

public class Demo04 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println(
                            Thread.currentThread().getName() + "卖出1张票，还剩" + (--TickerContent.count) + "张"
                    );
                }
            }
        };
        new Thread(r,"1").start();
        new Thread(r,"2").start();
        new Thread(r,"3").start();
        new Thread(r,"4").start();
        new Thread(r,"5").start();
        new Thread(r,"6").start();


    }
}
