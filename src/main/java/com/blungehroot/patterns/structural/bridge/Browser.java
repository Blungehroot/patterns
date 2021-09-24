package com.blungehroot.patterns.structural.bridge;

public abstract class Browser {
    protected ConfigBrowser configBrowser;

    public Browser(ConfigBrowser configBrowser) {
        this.configBrowser = configBrowser;
    }

    public abstract void requiredBrowserConfig();
}
