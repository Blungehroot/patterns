package com.blungehroot.patterns.structural.bridge;

public class ChromeConfig implements ConfigBrowser{
    @Override
    public void createBrowserConfig() {
        System.out.println("Create config for Chrome browser");
    }
}
