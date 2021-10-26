package com.savage.ch5_heap;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        String s = "com.savage";
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add(s);
                s = s + s;
                i++;
            }

        } catch (Throwable t) {
            System.out.println(i);
        }

    }
}
