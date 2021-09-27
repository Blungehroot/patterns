package com.blungehroot.patterns.behavioral.observer;

import java.util.List;

public class Client implements Observer {
    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> advertise) {
        System.out.println("Dear " + name + "\nWe have new awsome propostion for you in shop:\n" + advertise
                + "\n==========================\n");
    }
}
