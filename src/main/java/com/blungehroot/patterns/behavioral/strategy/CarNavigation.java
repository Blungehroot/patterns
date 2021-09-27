package com.blungehroot.patterns.behavioral.strategy;

public class CarNavigation implements Navigation {
    @Override
    public void navigate() {
        System.out.println("Navigation for car driver");
    }
}
