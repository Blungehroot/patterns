package com.blungehroot.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class RepairAutoRunner {
    public static void main(String[] args) {
        MechanicFactory mechanicFactory = new MechanicFactory();
        List<Mechanic> mechanicList = new ArrayList<>();

        mechanicList.add(mechanicFactory.getMechanicBySpec("engine"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("engine"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("engine"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("engine"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("engine"));

        mechanicList.add(mechanicFactory.getMechanicBySpec("chassis"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("chassis"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("chassis"));
        mechanicList.add(mechanicFactory.getMechanicBySpec("chassis"));

        for (Mechanic mechanic: mechanicList) {
            mechanic.repairAuto();
        }
    }
}
