package com.blungehroot.patterns.behavioral.mediator;

public interface Supervisor {
    void askLandingAvailable(String msg);

    void getAvailableLandingAccess(String msg);
}
