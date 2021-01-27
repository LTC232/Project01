package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Customer {

    public static void main(String[] args){
        System.out.println("helloWorld!!Customer");
    }

    public void method(){
        try {
            FileInputStream input = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
