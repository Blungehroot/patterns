package com.blungehroot.patterns.creational.prototype;

public class AdvertionFactory {
    Advertion advertion;

    public AdvertionFactory(Advertion advertion) {
        this.advertion = advertion;
    }

    public void setAdvertion(Advertion advertion) {
        this.advertion = advertion;
    }

    Advertion cloneAdvertion() {
        return (Advertion) advertion.copy();
    }
}
