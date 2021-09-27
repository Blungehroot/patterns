package com.blungehroot.patterns.behavioral.mediator;

public class AeroportLandingRunner {
    public static void main(String[] args) {
        AeroportConnectionImpl conn = new AeroportConnectionImpl();

        Supervisor supervisor = new AdminSupervisor(conn, "Sergey Supervisor");
        Supervisor plainPilot1 = new PlainPilot(conn, "Dmitry pilot ");
        Supervisor plainPilot2 = new PlainPilot(conn, "Yevhenii pilot ");

        conn.setAdminSupervisor(supervisor);
        conn.addPilotsToConnection(plainPilot1);
        conn.addPilotsToConnection(plainPilot2);

        plainPilot1.askLandingAvailable("Hello is line 1 available for landing? ");
        supervisor.askLandingAvailable("Yes line 1 is available");
    }
}
