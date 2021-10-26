package com.savage.ch2_classLoader;

public class DeadThreadTest {
    public static void main(String[] args) {
        //虚拟机必须保证一个类的<clinit>()方法在多线程下被加锁
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName()+"开始");
            DeadThead deadThead = new DeadThead();
            System.out.println(Thread.currentThread().getName()+"结束");
        };

        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");
        t1.start();
        t2.start();
    }
}

class DeadThead{
    static {
        if (true){
            System.out.println(Thread.currentThread().getName()+"初始化当前类");
            while (true){

            }
        }
    }
}
