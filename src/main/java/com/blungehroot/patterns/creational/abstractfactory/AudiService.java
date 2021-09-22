package com.blungehroot.patterns.creational.abstractfactory;

import com.blungehroot.patterns.creational.abstractfactory.europecars.EuropeanCarTeamServiceFactory;

public class AudiService {
    public static void main(String[] args) {
        ServiceStationFactory serviceStationFactory = new EuropeanCarTeamServiceFactory();
        AutoMechanic autoMechanic = serviceStationFactory.getAutoMechanic();
        Painter painter = serviceStationFactory.getPainter();
        TierChanger tierChanger = serviceStationFactory.getTierChanger();

        System.out.println("Start service audi from europe");

        autoMechanic.diagnostic();
        painter.painting();
        tierChanger.tierChange();
    }
}
