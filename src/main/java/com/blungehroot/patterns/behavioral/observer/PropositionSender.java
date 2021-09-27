package com.blungehroot.patterns.behavioral.observer;

public class PropositionSender {
    public static void main(String[] args) {
         ShopPropositionAdvertise shopPropositionAdvertise = new ShopPropositionAdvertise();

         shopPropositionAdvertise.addPropostion("First alcohol ad");
         shopPropositionAdvertise.addPropostion("Second fruits ad");

         Observer clientOne = new Client("Jacky Deniels");
         Observer clientTwo = new Client("Kevin Apple");

         shopPropositionAdvertise.addObserver(clientOne);
         shopPropositionAdvertise.addObserver(clientTwo);

         shopPropositionAdvertise.addPropostion("Juice ad");

         shopPropositionAdvertise.removeProposition("Second fruits ad");
    }
}
