package com.blungehroot.patterns.creational.builder;

public class Factory {
    VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    Vehicle buildVehicle() {
        vehicleBuilder.createVehicle();
        vehicleBuilder.buildCarColor();
        vehicleBuilder.buildVehicleEngine();
        vehicleBuilder.buildPrice();

        Vehicle vehicle = vehicleBuilder.getVehicle();

        return vehicle;
    }
}
