package com.blungehroot.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ShopPropositionAdvertise implements Observed {
    List<String> propostions = new ArrayList<>();
    List<Observer> clients = new ArrayList<>();

    public void addPropostion(String ad) {
        this.propostions.add(ad);
        notifyObservers();
    }

    public void removeProposition(String ad) {
        this.propostions.remove(ad);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.clients.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.clients.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: clients) {
            o.handleEvent(this.propostions);
        }
    }
}
