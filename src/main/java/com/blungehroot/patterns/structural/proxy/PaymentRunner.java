package com.blungehroot.patterns.structural.proxy;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new ProxyPayment("Google pay");

        payment.pay();
    }
}
