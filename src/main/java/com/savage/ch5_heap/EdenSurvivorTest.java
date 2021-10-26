package com.savage.ch5_heap;

/*
    新生代：老年代=1：2
    Eden:Survivor1:Survivor2=8:1:1
    -XX:NewRatio=4,表示新生代占1,老年代占4,新生代占整个堆的1/5
    -XX:SurvivorRatio=8 调整这个空间比例,8代表Eden:S1:S2=8:1:1，默认是8，但是会自适应调节
    -XX:-UseAdaptiveSizePolicy 关闭自适应的内存分配策略，可能不是8:1:1
    -Xmn:设置新生代最大内存大小,一般使用默认值就可以了，以这个为主
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
