package com.hui.volatileStudy;

public class SimpleTest {

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        demo.setName("demo-thread");
        demo.start();
        Thread.sleep(1000);
        demo.flag = false;
        demo.join();
        System.out.println(demo.getName() + "线程执行完毕：" + demo.count);

    }

    static class Demo extends Thread {
        Boolean flag = Boolean.TRUE;
        Integer count = 0;

        @Override
        public void run() {
            while (flag) {
                count++;
            }
        }
    }
}
