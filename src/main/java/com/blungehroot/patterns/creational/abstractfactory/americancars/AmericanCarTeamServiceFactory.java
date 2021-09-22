package com.blungehroot.patterns.creational.abstractfactory.americancars;

import com.blungehroot.patterns.creational.abstractfactory.AutoMechanic;
import com.blungehroot.patterns.creational.abstractfactory.Painter;
import com.blungehroot.patterns.creational.abstractfactory.ServiceStationFactory;
import com.blungehroot.patterns.creational.abstractfactory.TierChanger;

public class AmericanCarTeamServiceFactory implements ServiceStationFactory {
    @Override
    public AutoMechanic getAutoMechanic() {
        return new AmericanCarAutoMechanic();
    }

    @Override
    public Painter getPainter() {
        return new AmericanCarPainter();
    }

    @Override
    public TierChanger getTierChanger() {
        return new AmericanCarTierChanger();
    }
}
