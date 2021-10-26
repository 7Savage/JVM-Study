package com.savage.ch4_stack;

import java.util.Date;

public class LocalVariableTest {
    public static void main(String[] args) {
        LocalVariableTest test = new LocalVariableTest();
        int num = 10;
        test.test1();
    }

    public static void test1() {
        Date date = new Date();
        String name = "xiaozhi";

    }

    public void test2() {
        String s = "abc";
        Date date = new Date();
        double d = 20.92;
        int f=4;
    }

    public void test3(){
        {
            int a=3;
            System.out.println(a);
        }

        int b=4;//此时b会复用a的slot位
    }

}