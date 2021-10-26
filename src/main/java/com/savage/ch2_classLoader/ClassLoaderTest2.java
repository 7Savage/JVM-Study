package com.savage.ch2_classLoader;

import org.openjsse.sun.security.util.CurveDB;
import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        System.out.println("***引导类加载器***");
        //获取BootstrapClassLoader能加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        System.out.println("从上面的路径任选一个，看看它的类加载器");
        ClassLoader classLoader = Provider.class.getClassLoader();

        System.out.println("***扩展类加载器***");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        System.out.println("从上面的路径任选一个，看看它的类加载器");
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
