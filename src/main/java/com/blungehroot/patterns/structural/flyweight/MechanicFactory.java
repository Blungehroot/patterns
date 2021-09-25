package com.blungehroot.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MechanicFactory {
    private static final Map<String, Mechanic> mechanics = new HashMap<>();

    public Mechanic getMechanicBySpec(String spec) {
        Mechanic mechanic = mechanics.get(spec);

        if (mechanic == null) {
            switch (spec) {
                case "engine":
                    System.out.println("Hiring engine mechanic");
                    mechanic = new EngineMechanic();
                    break;
                case "chassis":
                    System.out.println("Hiring chassis mechanic");
                    mechanic = new ChassisMechanic();
                    break;
            }
            mechanics.put(spec, mechanic);
        }
        return mechanic;
    }
}
