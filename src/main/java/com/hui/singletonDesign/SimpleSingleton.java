package com.hui.singletonDesign;

// 简单单例  非线程安全
public class SimpleSingleton {

    private static SimpleSingleton instacne = null;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstacne() {
        if (instacne == null) {
            instacne = new SimpleSingleton();
        }
        return instacne;
    }
}
