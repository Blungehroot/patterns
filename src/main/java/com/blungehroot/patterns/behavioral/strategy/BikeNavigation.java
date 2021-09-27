package com.blungehroot.patterns.behavioral.strategy;

public class BikeNavigation implements Navigation {
    @Override
    public void navigate() {
        System.out.println("Navigation for bike driver");
    }
}
