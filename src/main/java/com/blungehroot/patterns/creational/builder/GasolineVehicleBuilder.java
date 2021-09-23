package com.blungehroot.patterns.creational.builder;

public class GasolineVehicleBuilder extends VehicleBuilder {
    @Override
    void buildCarColor() {
        vehicle.setVehicleColor("Red");
    }

    @Override
    void buildVehicleEngine() {
        vehicle.setEngine(Engine.GAS_ENGINE);
    }

    @Override
    void buildPrice() {
        vehicle.setPrice(40000);
    }
}
