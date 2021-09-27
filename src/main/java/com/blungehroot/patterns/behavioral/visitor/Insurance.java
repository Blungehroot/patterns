package com.blungehroot.patterns.behavioral.visitor;

public class Insurance implements InsuranceOffer {
    InsuranceOffer[] insuranceOffers;

    public Insurance() {
        this.insuranceOffers = new InsuranceOffer[] {
                new CarInsurance(),
                new HouseInsurance(),
                new HealthInsurance()
        };
    }

    @Override
    public void insuranceOffer(InsuranceAgent insuranceAgent) {
        for (InsuranceOffer insuranceOffer: insuranceOffers) {
            insuranceOffer.insuranceOffer(insuranceAgent);
        }
    }
}
