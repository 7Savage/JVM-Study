package com.savage.ch7_stringtable;

import org.junit.Test;

public class StringTest4 {

    @Test
    public void test1() {
        // 都是常量，前端编译期会进行代码优化
        // 通过idea直接看对应的反编译的class文件，会显示 String s1 = "abc"; 说明做了代码优化
        String s1 = "a" + "b" + "c";
        String s2 = "abc";

        // true，有上述可知，s1和s2实际上指向字符串常量池中的同一个值
        System.out.println(s1 == s2);
    }

    @Test
    public void test3(){
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        //s1+s2的细节
        // StringBuilder s=new StringBuilder();
        //s.append("a");
        //s.append("b");
        //s.toString();

        String s4 = s1 + s2;
        System.out.println(s3==s4);
    }

    @Test
    public  void test5() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        ///如果拼接符号出现了变量，相当于new String()
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true 编译期优化
        System.out.println(s3 == s5); // false s1是变量，不能编译期优化
        System.out.println(s3 == s6); // false s2是变量，不能编译期优化
        System.out.println(s3 == s7); // false s1、s2都是变量
        System.out.println(s5 == s6); // false s5、s6 不同的对象实例
        System.out.println(s5 == s7); // false s5、s7 不同的对象实例
        System.out.println(s6 == s7); // false s6、s7 不同的对象实例

        //判断字符串常量池中是否包含javaEEhadoop值，如果存在，则返回常量池中javaEEhadoop的地址
        //如果字符串常量池中不存在javaEEhadoop，，则在常量池中加载一份javaEEhadoop，并返回此对象的地址
        String s8 = s6.intern();
        System.out.println(s3 == s8); // true intern之后，s8和s3一样，指向字符串常量池中的"javaEEhadoop"
    }

    @Test
    public void test6(){
        String s0 = "beijing";
        String s1 = "bei";
        String s2 = "jing";
        String s3 = s1 + s2;
        System.out.println(s0 == s3); // false s3指向对象实例，s0指向字符串常量池中的"beijing"
        String s7 = "shanxi";
        final String s4 = "shan";
        final String s5 = "xi";
        String s6 = s4 + s5;
        System.out.println(s6 == s7); // true s4和s5是final修饰的，编译期就能确定s6的值了
    }
}
