package com.blungehroot.patterns.structural.proxy;

public class PayOrder implements Payment{
    private String payType;

    public PayOrder(String payType) {
        this.payType = payType;
        paymentAccept();
    }

    public void paymentAccept() {
        System.out.println("Payment accept via " + payType);
    }

    @Override
    public void pay() {
        System.out.println("Payment process " + payType);
    }
}
