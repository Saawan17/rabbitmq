package com.learn.rabbitMQ.controller;

import com.learn.rabbitMQ.event.OrderCreatedEvent;
import com.learn.rabbitMQ.producer.OrderProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderCreatedEvent event) {
        orderProducer.sendOrderCreatedEvent(event);
        return "Order event published successfully";
    }
}

