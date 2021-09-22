package com.blungehroot.patterns.creational.abstractfactory.americancars;

import com.blungehroot.patterns.creational.abstractfactory.Painter;

public class AmericanCarPainter implements Painter {
    @Override
    public void painting() {
        System.out.println("Painting american vehicle");
    }
}
