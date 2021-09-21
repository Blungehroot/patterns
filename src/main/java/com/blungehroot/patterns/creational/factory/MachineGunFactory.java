package com.blungehroot.patterns.creational.factory;

public class MachineGunFactory implements GunFactory{
    public Gun createGun() {
        return new MachineGun();
    }
}
