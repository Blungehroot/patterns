package com.blungehroot.patterns.creational.abstractfactory.europecars;

import com.blungehroot.patterns.creational.abstractfactory.AutoMechanic;
import com.blungehroot.patterns.creational.abstractfactory.Painter;
import com.blungehroot.patterns.creational.abstractfactory.ServiceStationFactory;
import com.blungehroot.patterns.creational.abstractfactory.TierChanger;

public class EuropeanCarTeamServiceFactory implements ServiceStationFactory {
    @Override
    public AutoMechanic getAutoMechanic() {
        return new EuropeanCarAutoMechanic();
    }

    @Override
    public Painter getPainter() {
        return new EuropeanCarPainter();
    }

    @Override
    public TierChanger getTierChanger() {
        return new EuropeanCarTierChanger();
    }
}
