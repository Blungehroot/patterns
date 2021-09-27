package com.blungehroot.patterns.behavioral.template;

public abstract class AppartmentsTemplate {
    public void showRoom() {
        System.out.println("Bath room");
        showRoomPlan();
        System.out.println("Doors");
        System.out.println("Walls");
    }

    public abstract void showRoomPlan();
}
