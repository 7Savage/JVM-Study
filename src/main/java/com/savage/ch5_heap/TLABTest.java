package com.savage.ch5_heap;

/*
    测试 -XX:UseTLAB参数是否开启：默认开启
 */
public class TLABTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
