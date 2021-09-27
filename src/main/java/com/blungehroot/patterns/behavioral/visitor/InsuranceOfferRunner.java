package com.blungehroot.patterns.behavioral.visitor;

public class InsuranceOfferRunner {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();

        InsuranceAgent traineeAgent = new TraineeInsuranceAgent();
        InsuranceAgent headAgent = new HeadInsuranceAgent();

        System.out.println("Trainee agnet introduce insurance");
        insurance.insuranceOffer(traineeAgent);
        System.out.println("=========================");

        System.out.println("Head agent introduce insurance");
        insurance.insuranceOffer(headAgent);
        System.out.println("=========================");
    }
}
