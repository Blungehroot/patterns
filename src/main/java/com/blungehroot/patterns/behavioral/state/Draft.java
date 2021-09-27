package com.blungehroot.patterns.behavioral.state;

public class Draft implements State {
    @Override
    public void publish() {
        System.out.println("Document is in draft mode");
    }
}
