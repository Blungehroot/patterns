package com.blungehroot.patterns.behavioral.template;

public class ApartmentsRunner {
    public static void main(String[] args) {
        AppartmentsTemplate bathRoom = new BathRoom();
        AppartmentsTemplate bedRoom = new BedRoom();

        bathRoom.showRoom();
        System.out.println("=================");
        bedRoom.showRoom();

    }
}
