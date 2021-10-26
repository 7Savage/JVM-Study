package com.savage.ch4_stack;

/**
 * 演示栈溢出
 */
public class StackErrorTest {
    private static int count=1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
        //java.lang.StackOverflowError
    }
}
