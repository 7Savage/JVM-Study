package com.savage.ch2_classLoader;

public class ClassLoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类加载器的第一种方式
        ClassLoader classloader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classloader1);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取类加载器的第二种方式
        ClassLoader classloader2 = Thread.currentThread().getContextClassLoader();
        System.out.println(classloader2);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取类加载器的第三种方式
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);//null,引导类加载器

        String[] strArr = new String[10];
        ClassLoader classLoader3 = strArr.getClass().getClassLoader();
        System.out.println(classLoader3);//null,表示使用的是引导类加载器

        ClassLoaderDemo[] refArr = new ClassLoaderDemo[10];
        System.out.println(refArr.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
        int[] intArr = new int[10];
        System.out.println(intArr.getClass().getClassLoader()); //null,如果数组的元素类型是基本数据类型,数组类是没有类加载器的
    }
}
