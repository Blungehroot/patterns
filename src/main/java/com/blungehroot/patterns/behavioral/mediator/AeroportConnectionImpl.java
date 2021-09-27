package com.blungehroot.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AeroportConnectionImpl implements AeroportConnection {
    Supervisor adminSupervisor;
    List<Supervisor> supervisors = new ArrayList<>();

    public void setAdminSupervisor(Supervisor adminSupervisor) {
        this.adminSupervisor = adminSupervisor;
    }

    public void addPilotsToConnection(Supervisor supervisor) {
        this.supervisors.add(supervisor);
    }

    @Override
    public void landingPlain(String msg, Supervisor supervisor) {
        for (Supervisor s: supervisors) {
            if (s != supervisor) {
                s.getAvailableLandingAccess(msg);
            }
        }
        adminSupervisor.getAvailableLandingAccess(msg);
    }
}
