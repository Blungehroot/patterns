package com.blungehroot.patterns.structural.adapter;

public class DataRunner {
    public static void main(String[] args) {
        Data data = new AdapterJson();

        data.read();
        data.write();
    }
}
