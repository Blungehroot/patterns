package com.blungehroot.patterns.creational.singelton;

public class WebDriver {
    private static WebDriver webDriver;
    private static String startWebDriver = "Start single WebDriver...\n";

    public static synchronized WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = new WebDriver();
        }

        return webDriver;
    }

    private WebDriver() {}

    public void informThatWebDriverIsStarted(String msg) {
        startWebDriver += msg +"\n";
    }

    public void showInfo() {
        System.out.println(startWebDriver);
    }
}
