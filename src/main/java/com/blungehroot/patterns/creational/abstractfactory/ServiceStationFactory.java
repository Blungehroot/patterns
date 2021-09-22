package com.blungehroot.patterns.creational.abstractfactory;

public interface ServiceStationFactory {
    AutoMechanic getAutoMechanic();
    Painter getPainter();
    TierChanger getTierChanger();
}
