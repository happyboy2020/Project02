package com.hwttnet.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {



    public static  void main (String args[]){

        System.out.print("hello world!!!");

        ArrayList list = new ArrayList();
        System.out.print("hello world!!!");
        Date date = new Date();

    }

    public static  void method1()
    {

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
