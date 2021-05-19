package com.company.demo02;

public class TestDemo02 {
    public static void main(String[] args) {
        Demo02 demo02=new Demo02();
        Thread thread=new Thread(demo02);
        thread.start();
    }
}
