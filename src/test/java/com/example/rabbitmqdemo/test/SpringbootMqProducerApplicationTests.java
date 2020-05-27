package com.example.rabbitmqdemo.test;

import com.example.rabbitmqdemo.configuration.RabbitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringbootMqProducerApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Test
    void contextLoads() {
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, "item.insert", "商品新增，routing key 为item.insert");
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, "item.update", "商品修改，routing key 为item.update");
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, "item.delete", "商品删除，routing key 为item.delete");
    }

}
