package com.savage.ch4_stack;

import java.util.Date;

public class ReturnAddressTest {
    public boolean methodBoolean() {
        return false;
    }

    public byte methodByte() {
        return 0;
    }

    public short methodShort() {
        return 0;
    }

    public int methodInt() {
        return 0;
    }

    public long methodLong() {
        return 0l;
    }

    public double methodDouble() {
        return 0d;
    }

    public float methodFloat() {
        return 0f;
    }

    public String methodString() {
        return "";
    }

    public Date methodDate() {
        return new Date();
    }

    public void methodVoid() {
        return;
    }

    static {
        int i=0;
    }

}
