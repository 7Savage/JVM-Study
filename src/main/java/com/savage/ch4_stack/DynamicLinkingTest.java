package com.savage.ch4_stack;

public class DynamicLinkingTest {
    int num = 10;

    public void methodA() {
        System.out.println("A");
    }

    public void methodB() {
        System.out.println("B");
        methodA();
        num++;
    }
}
