package com.blungehroot.patterns.behavioral.visitor;

public class HealthInsurance implements InsuranceOffer {
    @Override
    public void insuranceOffer(InsuranceAgent insuranceAgent) {
        insuranceAgent.makeOffer(this);
    }
}
