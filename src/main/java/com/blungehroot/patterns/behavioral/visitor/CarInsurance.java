package com.blungehroot.patterns.behavioral.visitor;

public class CarInsurance implements InsuranceOffer {
    @Override
    public void insuranceOffer(InsuranceAgent insuranceAgent) {
        insuranceAgent.makeOffer(this);
    }
}
