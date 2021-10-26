package com.savage.ch2_classLoader;

public class ClinitTest {
    private int a = 1;

//    static {
//        int c=2;
//    }

    public static void main(String[] args) {
        int b = 2;
        //jclasslib中没有<clinit>,<clinit>必须有静态代码块、属性才出现

    }
}
