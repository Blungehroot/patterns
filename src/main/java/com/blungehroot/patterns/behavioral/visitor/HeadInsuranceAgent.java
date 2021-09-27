package com.blungehroot.patterns.behavioral.visitor;

public class HeadInsuranceAgent implements InsuranceAgent {
    @Override
    public void makeOffer(CarInsurance carInsurance) {
        System.out.println("Make good car insurance offer for client");
    }

    @Override
    public void makeOffer(HouseInsurance houseInsurance) {
        System.out.println("Make good house insurance offer for client");
    }

    @Override
    public void makeOffer(HealthInsurance healthInsurance) {
        System.out.println("Make good health insurance offer for client");
    }
}
