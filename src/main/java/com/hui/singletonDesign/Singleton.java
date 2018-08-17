package com.hui.singletonDesign;

//“ 基于内部类实现的单例，既满足线程安全又有好的性能
public class Singleton {

    private String name = "this is a singleton";

    // 私有化构造器，防止被实例
    private Singleton() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 静态工程方法，创建实例 */
//    public static Singleton getIsntance() {
//        if (instance == null) {
//            synchronized (Singleton.class){
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
