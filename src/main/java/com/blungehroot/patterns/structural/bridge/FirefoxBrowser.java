package com.blungehroot.patterns.structural.bridge;

public class FirefoxBrowser extends Browser{

    protected FirefoxBrowser(ConfigBrowser configBrowser) {
        super(configBrowser);
    }

    @Override
    public void requiredBrowserConfig() {
        System.out.println("Required firefox config");
        configBrowser.createBrowserConfig();
    }
}
