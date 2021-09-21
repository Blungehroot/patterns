package com.blungehroot.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        GunFactory gunFactory = loadGunByType("machine gun");

        Gun gun = gunFactory.createGun();

        gun.loadGun();
    }

    static GunFactory loadGunByType(String gunType) {
        if (gunType.equalsIgnoreCase("Handgun")) {
            return new HandGunFactory();
        } else if (gunType.equalsIgnoreCase("Machine gun")) {
            return new MachineGunFactory();
        } else {
            throw new RuntimeException(gunType + "Gun type is not supported");
        }
    }
}
