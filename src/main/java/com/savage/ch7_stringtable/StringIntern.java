package com.savage.ch7_stringtable;

import org.junit.Test;

public class StringIntern {

    @Test
    public void test1(){
        /*
         * ① String s = new String("1")
         * 创建了两个对象
         * 		堆空间中一个new对象
         * 		字符串常量池中一个字符串常量"1"（注意：此时字符串常量池中已有"1"）ldc
         * ② s.intern()由于字符串常量池中已存在"1"
         *
         * s  指向的是堆空间中的对象地址
         * s2 指向的是堆空间中常量池中"1"的地址
         * 所以不相等
         */
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s==s2); // jdk1.6 false jdk7/8 false

        /*
         * ① String s3 = new String("1") + new String("1")
         * 等价于new String（"11"），但是，常量池中并不生成字符串"11"；
         *
         * ② s3.intern()
         * 由于此时常量池中并无"11"，所以把s3中记录的对象的地址存入常量池
         * 所以s3 和 s4 指向的都是一个地址
         */
        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3==s4); //jdk1.6 false jdk7/8 true
    }

    @Test
    public void test2() {
        //创建了6个对象
        //new StringBuilder()
        //new String("a")
        //常量池中的a
        //new String("b")
        //常量池中的b
        //StringBuilder里有new String("ab")，但是在常量池中没有生成ab

        String s1 = new String("a") + new String("b");
        String s2 = s1.intern();
        System.out.println(s1 == "ab");
        System.out.println(s2 == "ab");
    }
}
