package com.savage.ch2_classLoader;

public class ClassInitTest {
    private  static int num=1; //类变量的赋值动作
    //静态代码快中的语句
    static{
        num=2;
        number=20;
        //System.out.println(num);
        //System.out.println(number); 报错:非法的前向引用
    }
    //Linking之prepare: number=0 -->initial:20-->10
    private static int number=10;

    //场景3:比如对于声明为static final的基本数据类型的字段,不管是否进行了显式赋值,都不会生成<clinit>()方法
    public static final int num2 = 1;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
