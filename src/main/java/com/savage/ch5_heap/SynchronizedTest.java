package com.savage.ch5_heap;

/*
    代码中对hellis这个对象加锁(每个线程都有一个hellis对象的锁),但是hellis对象的生命周期只在f( )方法中,
    并不会被其他线程所访问到,所以在JIT编译阶段就会被优化掉,优化成如下f2
 */
public class SynchronizedTest {
    public void f() {
        Object hellis = new Object();
        synchronized(hellis) {
            System.out.println(hellis);
        }
    }
    // JIT会将它变成这样
    public void f2() {
        Object hellis = new Object();
        System.out.println(hellis);
    }
}
