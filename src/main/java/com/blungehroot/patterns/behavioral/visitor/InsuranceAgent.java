package com.blungehroot.patterns.behavioral.visitor;

public interface InsuranceAgent {
    public void makeOffer(CarInsurance carInsurance);
    public void makeOffer(HouseInsurance houseInsurance);
    public void makeOffer(HealthInsurance healthInsurance);
}
