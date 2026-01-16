package com.learn.rabbitMQ.event;

public class OrderCreatedEvent {

    private Long orderId;
    private String productName;
    private int quantity;

    public OrderCreatedEvent() {
    }

    public OrderCreatedEvent(Long orderId, String productName, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}

