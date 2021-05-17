package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wangxiaolong\\Desktop\\you-get 下载.txt"));
        BufferedReader writer=new BufferedWriter(new FileWriter("D:\\des\\hah.txt"));
        int  len=0;
        char [] buffer=new char[1024];
        long start=System.currentTimeMillis();
        while (len=reader.read(buffer))!=-1){
            writer.write(buffer,0,len);
        }
        writer.flush();
        long end=System.currentTimeMillis();
        System.out.println("时间："+(end-start));
        reader.close();
        writer.close();
    }
}
