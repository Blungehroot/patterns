package com.blungehroot.patterns.creational.builder;

public class ElectircVehicleBuilder extends VehicleBuilder {
    @Override
    void buildCarColor() {
        vehicle.setVehicleColor("Blue");
    }

    @Override
    void buildVehicleEngine() {
        vehicle.setEngine(Engine.ELECTRIC_ENGINE);
    }

    @Override
    void buildPrice() {
        vehicle.setPrice(20000);
    }
}
