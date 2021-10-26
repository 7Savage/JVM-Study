package com.savage.ch2_classLoader;

public class ClinitTest2 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        //先加载Father类，再加载Son
        System.out.println(Son.B);
    }
}
