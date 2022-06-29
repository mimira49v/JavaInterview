package com.syntax.class25;

public class Task2 {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
}

class FirefoxDriver implements WebDriver {
    public void openBrowser() {System.out.println("Opening FirefoxDriver browser");}
    public void closeBrowser() {System.out.println("Opening FirefoxDriver browser");}
    public void maximizeWindow() {System.out.println("Opening FirefoxDriver browser");}
    public void findElement() {System.out.println("Opening FirefoxDriver browser");}

    @Override
    public void get(String s) {

    }
}
class WebDriverTester1{
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.openBrowser();
        webDriver.openBrowser();
        webDriver.findElement();
        webDriver.maximizeWindow();
        webDriver.closeBrowser();

        WebDriver[] webDrivers = {new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver w:webDrivers
             ) {
        w.openBrowser();
        w.openBrowser();
        w.findElement();
        w.maximizeWindow();
        w.closeBrowser();
        }
    }

}