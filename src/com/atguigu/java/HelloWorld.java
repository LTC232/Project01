package com.atguigu.java;

import java.util.Date;

public class HelloWorld {
    private String name;

    //这里是单行注解
    public static void main(String[] args){

        System.out.println("helloWorld!!");

        Date date = new Date();

        System.out.println(date);
    }
}
