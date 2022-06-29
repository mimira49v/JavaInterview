package com.syntax.class25;

public class ChromeDriver implements WebDriver {
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }

    public void closeBrowser() {
        System.out.println("Close Chrome browser");
    }

    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");
    }

    public void findElement() {
        System.out.println("Finding elements in Chrome browser");
    }

    @Override
    public void get(String s) {

    }
}
