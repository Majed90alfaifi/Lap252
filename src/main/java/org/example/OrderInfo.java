package org.example;

public class OrderInfo extends Product {//Q6>> because the Order information not strong related to class Product
    private int orderId;
    private String orderStatus;


    public OrderInfo(int id, double price, String name, int orderId, String orderStatus) {
        super(id, price, name);
        this.orderId = orderId;
        this.orderStatus = "created";
    }
}
