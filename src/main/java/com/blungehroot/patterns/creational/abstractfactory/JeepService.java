package com.blungehroot.patterns.creational.abstractfactory;

import com.blungehroot.patterns.creational.abstractfactory.americancars.AmericanCarTeamServiceFactory;

public class JeepService {
    public static void main(String[] args) {
        ServiceStationFactory serviceStationFactory = new AmericanCarTeamServiceFactory();
        AutoMechanic autoMechanic = serviceStationFactory.getAutoMechanic();
        Painter painter = serviceStationFactory.getPainter();
        TierChanger tierChanger = serviceStationFactory.getTierChanger();

        System.out.println("Start service jeep vehicle from USA");

        autoMechanic.diagnostic();
        painter.painting();
        tierChanger.tierChange();
    }
}
