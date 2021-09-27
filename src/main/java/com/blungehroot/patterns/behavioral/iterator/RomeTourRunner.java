package com.blungehroot.patterns.behavioral.iterator;

public class RomeTourRunner {
    public static void main(String[] args) {
        String[] tours = {"Walk tour", "Bus tour", "guide tour"};

        RomeTour romeTour = new RomeTour("Rome available tours", tours);

        Iterator iterator = romeTour.getIterator();
        System.out.println("Rome tour:" + romeTour.getTour());
        System.out.println("Tours types: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
