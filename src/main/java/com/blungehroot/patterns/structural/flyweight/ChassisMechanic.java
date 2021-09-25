package com.blungehroot.patterns.structural.flyweight;

public class ChassisMechanic implements Mechanic{
    @Override
    public void repairAuto() {
        System.out.println("Chassis mechanic repair chassis");
    }
}
