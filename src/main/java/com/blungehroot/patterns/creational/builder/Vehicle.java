package com.blungehroot.patterns.creational.builder;


public class Vehicle {
    private String vehicleColor;
    private Engine engine;
    private int price;

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleColor='" + vehicleColor + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }
}
