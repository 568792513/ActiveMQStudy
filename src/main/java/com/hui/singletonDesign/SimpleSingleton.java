package com.hui.singletonDesign;

// 简单单例  非线程安全
public class SimpleSingleton {

    private static SimpleSingleton instacne = null;

    // 私有化构造器
    private SimpleSingleton() {
    }

    // 使用内部方法来初始化类
    public static SimpleSingleton getInstacne() {
        if (instacne == null) {
            instacne = new SimpleSingleton();
        }
        return instacne;
    }
}

