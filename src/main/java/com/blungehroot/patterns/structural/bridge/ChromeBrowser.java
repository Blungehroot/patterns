package com.blungehroot.patterns.structural.bridge;

public class ChromeBrowser extends Browser{

    protected ChromeBrowser(ConfigBrowser configBrowser){
        super(configBrowser);
    }

    @Override
    public void requiredBrowserConfig() {
        System.out.println("Required chrome browser config");
        configBrowser.createBrowserConfig();
    }
}
