package com.hui.jvm;

public class GCTest {
    public static void main(String[] args) {
        byte[] placeholder = new byte[1000000000 * 1024 * 1024 * 1024];
        int a = 0;
        System.out.println("ok");
        System.gc();
    }
}
