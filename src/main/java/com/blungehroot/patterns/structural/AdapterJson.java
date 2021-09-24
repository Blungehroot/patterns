package com.blungehroot.patterns.structural;

public class AdapterJson extends JsonData implements Data {
    @Override
    public void write() {
        writeJson();
    }

    @Override
    public void read() {
        readJson();
    }
}
