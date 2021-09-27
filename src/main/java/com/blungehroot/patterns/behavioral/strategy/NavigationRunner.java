package com.blungehroot.patterns.behavioral.strategy;

public class NavigationRunner {
    public static void main(String[] args) {
        Tourist tourist = new Tourist();
        tourist.setNavigation(new WalkNavigation());
        tourist.executeNavigation();

        tourist.setNavigation(new BikeNavigation());
        tourist.executeNavigation();

        tourist.setNavigation(new CarNavigation());
        tourist.executeNavigation();
    }
}
