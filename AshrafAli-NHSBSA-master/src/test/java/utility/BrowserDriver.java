package utility;


import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;

import static java.lang.String.valueOf;


public class BrowserDriver {
    public static RemoteWebDriver driver;
    public static void invokedriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;

        }
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        driver.manage().window().maximize();
        System.out.println("Title of the page:" + driver.getTitle());

    }

    public static void close() throws InterruptedException {
        driver.close();
    }

    public void enterText(String locator, String text) {
        WebElement SendKeys = driver.findElement(By.xpath(locator));
        SendKeys.clear();
        SendKeys.sendKeys(text);
    }
//    public static void selectDropdown(By locator, String option) {
//        WebElement dropdown = driver.findElement(locator);
//        Select select = new Select(dropdown);
//        select.selectByVisibleText(option);
//    }
//
//    public static void acceptAlert() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//        } catch (NoAlertPresentException e) {
//            // Alert not present, do nothing or handle the exception as needed
//        }
//    }
//
//    public static void switchToFrame(By frameLocator) {
//        WebElement frameElement = driver.findElement(frameLocator);
//        driver.switchTo().frame(frameElement);
//    }
//
//    public static void switchToDefaultContent() {
//        driver.switchTo().defaultContent();
//    }
//
//    public static void clearText(By locator) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//    }
//
//    public static void click(By locator) {
//        WebElement element = driver.findElement(locator);
//        element.click();
//    }
//
//    // Method to move to the next tab, close it, and return to the original tab
//    public static void switchToNextTab(By locator) {
//        WebElement element = driver.findElement(locator);
//        element.click();
//        // Get the window handles
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        // Switch to the newly opened tab
//        driver.switchTo().window(tabs.get(1));
//        // Close the newly opened tab
//        driver.close();
//        // Switch back to the original tab
//        driver.switchTo().window(tabs.get(0));
//    }
//
//    public static String getText(By locator) {
//        WebElement element = driver.findElement(locator);
//        element.getText();
//        return null;
//    }

}
