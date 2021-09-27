package com.blungehroot.patterns.behavioral.strategy;

public class Tourist {
    Navigation navigation;

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public void executeNavigation() {
        navigation.navigate();
    }
}
