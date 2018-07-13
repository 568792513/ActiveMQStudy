package com.hui.active;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.*;

public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    //ActiveMq 的默认用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //ActiveMq 的默认登录密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //ActiveMQ 的链接地址
    private static final String BROKEN_URL = ActiveMQConnection.DEFAULT_BROKER_URL;

    //连接工厂
    private ConnectionFactory connectionFactory;
    //链接对象
    private Connection connection;
    //会话
    private Session session;

    public void init() {
        //创建一个链接工厂
        connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKEN_URL);
        try {
            //从工厂中创建一个链接
            connection = connectionFactory.createConnection();
            //开启链接
            connection.start();
            //创建一个事务（这里通过参数可以设置事务的级别）
            session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
        } catch (JMSException e) {
            e.printStackTrace();
        }
        logger.info("->初始化连接成功");
    }

    public void sendMessage(String destinationName, String msg) {
        try {
            //创建消息队列
            Queue queue = session.createQueue(destinationName);
            //创建消息生产者
            MessageProducer messageProducer = session.createProducer(queue);
            //创建消息
            Message message = session.createTextMessage(msg);
            //发送消息
            messageProducer.send(message);
            //打印
            logger.info(msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
