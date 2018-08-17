package com.hui.singletonDesign;

public class test {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a.getName());
        Singleton b = Singleton.getInstance();
        b.setName("ok");
        System.out.println(b.getName());
        System.out.println(a.getName());
    }
}
