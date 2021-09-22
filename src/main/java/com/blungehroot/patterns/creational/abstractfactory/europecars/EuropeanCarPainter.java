package com.blungehroot.patterns.creational.abstractfactory.europecars;

import com.blungehroot.patterns.creational.abstractfactory.Painter;

public class EuropeanCarPainter implements Painter {
    @Override
    public void painting() {
        System.out.println("Painting european vehicle");
    }
}
