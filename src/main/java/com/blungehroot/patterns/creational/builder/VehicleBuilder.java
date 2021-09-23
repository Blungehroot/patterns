package com.blungehroot.patterns.creational.builder;

public abstract class VehicleBuilder {
    Vehicle vehicle;

    void createVehicle() {
        vehicle = new Vehicle();
    }

    abstract void buildCarColor();

    abstract void buildVehicleEngine();

    abstract void buildPrice();

    Vehicle getVehicle() {
        return vehicle;
    }
}
