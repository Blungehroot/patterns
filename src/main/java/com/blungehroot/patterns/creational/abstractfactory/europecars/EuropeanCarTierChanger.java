package com.blungehroot.patterns.creational.abstractfactory.europecars;

import com.blungehroot.patterns.creational.abstractfactory.TierChanger;

public class EuropeanCarTierChanger implements TierChanger {
    @Override
    public void tierChange() {
        System.out.println("Change tiers on european vehicle");
    }
}
