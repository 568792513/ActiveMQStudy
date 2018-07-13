package com.hui.active;

public class testProducer {

    public static void main(String[] args) {
        //创建生产者
        Producer producer = new Producer();
        //建立连接
        producer.init();
        //生产消息
        producer.sendMessage("test", "this is message !");
//        while (true){
//            producer.sendMessage("test1", "this is message !");
//        }
    }

}
