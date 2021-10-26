package com.savage.ch2_classLoader;

public class StringTest {
    public static void main(String[] args) {
        String s = new java.lang.String();
        System.out.println("StringTest");
        //双亲委派机制，用的还是核心api里的String
    }
}
