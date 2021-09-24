package com.blungehroot.patterns.structural.bridge;

public class CrossPlatformConnector {
    public static void main(String[] args) {
        Browser[] browsers = {
                new ChromeBrowser(new ChromeConfig()),
                new FirefoxBrowser(new FirefoxConfig())
        };

        for (Browser browser: browsers) {
            browser.requiredBrowserConfig();
        }
    }
}