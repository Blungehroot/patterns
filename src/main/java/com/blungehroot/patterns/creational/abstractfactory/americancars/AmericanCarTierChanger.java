package com.blungehroot.patterns.creational.abstractfactory.americancars;

import com.blungehroot.patterns.creational.abstractfactory.TierChanger;

public class AmericanCarTierChanger implements TierChanger {
    @Override
    public void tierChange() {
        System.out.println("Change tier on american vehicle");
    }
}
