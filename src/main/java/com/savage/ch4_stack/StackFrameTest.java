package com.savage.ch4_stack;

public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    private void method1() {
        System.out.println("method1开始。。。");
        method2();
        System.out.println("method1结束。。。");
    }

    private void method2() {
        System.out.println("method2开始。。。");
        method3();
        System.out.println("method2结束。。。");
    }

    private int method3() {
        System.out.println("method3开始。。。");
        int i = 3;
        double v = method4();
        System.out.println("method3结束。。。");
        return i + (int) v;
    }

    private double method4() {
        System.out.println("method4开始。。。");
        double j = 20;
        System.out.println("method4结束。。。");
        return j;
    }
}
