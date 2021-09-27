package com.blungehroot.patterns.behavioral.mediator;

public class PlainPilot implements Supervisor {
    AeroportConnection aeroportConnection;
    String aeroportLine;

    public PlainPilot(AeroportConnection aeroportConnection, String aeroportLine) {
        this.aeroportConnection = aeroportConnection;
        this.aeroportLine = aeroportLine;
    }

    public String getAeroportLine() {
        return aeroportLine;
    }

    public void setAeroportLine(String aeroportLine) {
        this.aeroportLine = aeroportLine;
    }

    @Override
    public void askLandingAvailable(String msg) {
        aeroportConnection.landingPlain(msg, this);
    }

    @Override
    public void getAvailableLandingAccess(String msg) {
        System.out.println(this.aeroportLine + "Receiving message: " + msg + ".");
    }
}
