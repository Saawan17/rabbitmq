package com.learn.rabbitMQ.service;

import com.learn.rabbitMQ.config.RabbitMQConfig;
import com.learn.rabbitMQ.event.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @RabbitListener(queues = RabbitMQConfig.ORDER_QUEUE)
    public void consumeOrder(OrderCreatedEvent event) {
        System.out.println("Order received:");
        System.out.println("Order ID: " + event.getOrderId());
        System.out.println("Product: " + event.getProductName());
        System.out.println("Quantity: " + event.getQuantity());
    }
}

