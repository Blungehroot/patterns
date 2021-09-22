package com.blungehroot.patterns.creational.abstractfactory.americancars;

import com.blungehroot.patterns.creational.abstractfactory.AutoMechanic;

public class AmericanCarAutoMechanic implements AutoMechanic {
    @Override
    public void diagnostic() {
        System.out.println("Diagnostic american vehicle");
    }
}
