package com.blungehroot.patterns.structural.bridge;

public class FirefoxConfig implements ConfigBrowser{
    @Override
    public void createBrowserConfig() {
        System.out.println("Create config for firefox browser");
    }
}
