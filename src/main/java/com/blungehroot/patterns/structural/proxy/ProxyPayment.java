package com.blungehroot.patterns.structural.proxy;

public class ProxyPayment implements Payment{
    private String payType;
    private PayOrder payOrder;

    public ProxyPayment(String payType) {
        this.payType = payType;
    }

    @Override
    public void pay() {
        if (payOrder == null){
            payOrder = new PayOrder(payType);
        }

        payOrder.pay();
    }
}
