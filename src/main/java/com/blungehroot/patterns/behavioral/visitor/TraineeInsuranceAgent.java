package com.blungehroot.patterns.behavioral.visitor;

public class TraineeInsuranceAgent implements InsuranceAgent {
    @Override
    public void makeOffer(CarInsurance carInsurance) {
        System.out.println("bad car insurance for client");
    }

    @Override
    public void makeOffer(HouseInsurance houseInsurance) {
        System.out.println("bad house insurance for client");
    }

    @Override
    public void makeOffer(HealthInsurance healthInsurance) {
        System.out.println("bad health insurance for client");
    }
}
