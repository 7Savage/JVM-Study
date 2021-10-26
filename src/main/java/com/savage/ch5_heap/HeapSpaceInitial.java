package com.savage.ch5_heap;

/**
 * -Xms:600m
 * -Xmx:600m
 * 查看设置的参数:
 * 方式一(cmd中):jps  / jstat -gc 进程id
 * 方式二(XX:+PrintGCDetails)
 */
public class HeapSpaceInitial {
    public static void main(String[] args)throws Exception {
        //返回Java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory()/1024/1024;
        //返回Java虚拟机试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory()/1024/1024;
        System.out.println("-Xms:"+initialMemory+"M");
        System.out.println("-Xmx:"+maxMemory+"M");
        //TimeUnit.SECONDS.sleep(1000000);
    }
}
