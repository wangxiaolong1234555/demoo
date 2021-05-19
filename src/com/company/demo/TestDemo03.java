package com.company.demo;

public class TestDemo03 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(""+Thread.currentThread().getName());

        Demo03 demo03=new Demo03();
        Thread thread=new Thread(demo03);
        thread.setDaemon(true);
        thread.start();

        thread.sleep(500);
        System.out.println("你好，世界");
        System.out.println("退出主线程"+Thread.currentThread().getName());
    }

   
}
