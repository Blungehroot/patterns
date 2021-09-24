package com.blungehroot.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void createOrder() {
        System.out.println("Order is created");
        for (Product product: products) {
            product.placePhone();
        }
    }
}
