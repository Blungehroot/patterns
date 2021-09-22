package com.blungehroot.patterns.creational.abstractfactory.europecars;

import com.blungehroot.patterns.creational.abstractfactory.AutoMechanic;

public class EuropeanCarAutoMechanic implements AutoMechanic {
    @Override
    public void diagnostic() {
        System.out.println("Diagnostic european vehicle");
    }
}
