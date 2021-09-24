package com.blungehroot.patterns.structural;

public class DataRunner {
    public static void main(String[] args) {
        Data data = new AdapterJson();

        data.read();
        data.write();
    }
}
