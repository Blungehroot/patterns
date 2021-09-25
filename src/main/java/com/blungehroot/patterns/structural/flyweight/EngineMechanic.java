package com.blungehroot.patterns.structural.flyweight;

public class EngineMechanic implements Mechanic{
    @Override
    public void repairAuto() {
        System.out.println("Engine mechanic repair engine");
    }
}
