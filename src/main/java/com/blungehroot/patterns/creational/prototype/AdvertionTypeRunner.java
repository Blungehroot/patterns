package com.blungehroot.patterns.creational.prototype;

public class AdvertionTypeRunner {
    public static void main(String[] args) {
        Advertion contextAd = new Advertion(1, "Context AD for Nivea", "Awesome plan");
        System.out.println(contextAd);

        AdvertionFactory factory = new AdvertionFactory(contextAd);
        Advertion contextAdClone = factory.cloneAdvertion();

        System.out.println(contextAdClone);
    }
}
