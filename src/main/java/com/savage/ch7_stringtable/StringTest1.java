package com.savage.ch7_stringtable;

import org.junit.Test;

public class StringTest1 {

    @Test
    public void test() {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        s1 += "def";
        System.out.println(s1 == s2);
    }

    @Test
    public void test3() {
        String s1 = "abc";
        String s2 = s1.replace('c','m');

        System.out.println(s1 == s2);
    }
}
