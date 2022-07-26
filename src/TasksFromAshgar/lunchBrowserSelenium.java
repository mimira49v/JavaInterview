package TasksFromAshgar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchBrowserSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Web Orders Login";
        System.out.println(expectedTitle);

        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched!!");
        else
            System.out.println("Title didn't match!!");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();
        driver.quit();
    }
}
