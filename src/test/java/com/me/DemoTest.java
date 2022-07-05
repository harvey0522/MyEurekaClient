package com.me;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${mq.queue}")
    private String queue;

    @Test
    public void testSend(){
        while(true) {
            String string = UUID.randomUUID().toString();
            rabbitTemplate.convertAndSend(queue, "hello world!!!" + string);
        }
    }

}
