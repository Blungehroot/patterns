package com.blungehroot.patterns.behavioral.strategy;

public class WalkNavigation implements Navigation {
    @Override
    public void navigate() {
        System.out.println("Navigate for walking trip");
    }
}
