package com.blungehroot.patterns.behavioral.state;

public class Published implements State {
    @Override
    public void publish() {
        System.out.println("Document is published");
    }
}
