package com.blungehroot.patterns.creational.singelton;

public class WebDriverRunner {
    public static void main(String[] args) {
        WebDriver.getWebDriver().informThatWebDriverIsStarted("Started");
        WebDriver.getWebDriver().informThatWebDriverIsStarted("Continuous used web driver");
        WebDriver.getWebDriver().informThatWebDriverIsStarted("and again ...");

        WebDriver.getWebDriver().showInfo();
    }
}
