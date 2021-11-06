package com.savage.ch7_stringtable;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
 */
public class StringTest2 {
    public static void main(String[] args) {
        //使用set保持常量池，避免full gc回收
        Set<String> set=new HashSet<>();
        short i=0;
        while (true){
            set.add(String.valueOf(i++).intern());
        }

    }


}
