package com.blungehroot.patterns.structural.composite;

public class Shop {
    public static void main(String[] args) {
        Order order = new Order();

        Product productMobileOne = new IphoneMobile();
        Product productMobileTwo = new XiaomiMobile();

        order.addProduct(productMobileOne);
        order.addProduct(productMobileTwo);

        order.createOrder();
    }
}
