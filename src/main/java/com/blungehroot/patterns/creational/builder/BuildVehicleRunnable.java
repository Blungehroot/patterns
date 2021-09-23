package com.blungehroot.patterns.creational.builder;

public class BuildVehicleRunnable {
    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.setVehicleBuilder(new GasolineVehicleBuilder());
        Vehicle vehicle = factory.buildVehicle();

        System.out.println(vehicle);
    }
}
