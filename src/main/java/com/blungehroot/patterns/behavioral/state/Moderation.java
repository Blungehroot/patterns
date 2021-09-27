package com.blungehroot.patterns.behavioral.state;

public class Moderation implements State {
    @Override
    public void publish() {
        System.out.println("Document under moderation");
    }
}
