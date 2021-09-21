package com.blungehroot.patterns.creational.factory;

public class HandGunFactory implements GunFactory{
    public Gun createGun() {
        return new HandGun();
    }
}
