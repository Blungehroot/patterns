package com.blungehroot.patterns.behavioral.visitor;

public class HouseInsurance implements InsuranceOffer {
    @Override
    public void insuranceOffer(InsuranceAgent insuranceAgent) {
        insuranceAgent.makeOffer(this);
    }
}
