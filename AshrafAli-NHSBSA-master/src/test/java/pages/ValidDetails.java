package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ValidDetails extends BrowserDriver {
    public static String First_Name = "//*[@id='FirstName']";
    public static String last_Name = "//*[@id='lastName']";
    public static String Middle_Name = "//*[@id='middleName']";
    public static String Save_Button = "/html/body/div[3]/div[3]/div/button[1]/span";
    public static String Cancel_Button = "/html/body/div[3]/div[3]/div/button[2]/span";
    public static String Password = "//*[@id='password']";
    public static String Name = "//*[@id='name']";
    public static String User_Name = "//*[@id='quoteForm']/fieldset/section/div/div[1]/div[2]/div[1]/input";
    public static String Email = "//*[@id='quoteForm']/fieldset/section/div/div[1]/div[2]/div[2]/input";
    public static String Conform_Password = "//*[@id='confirmPassword']";
    public static String Phone_Number = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[2]/input";
    public static String DOB = "//*[@id='dateOfBirth']";
    public static String Rdo_Male = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[5]/label[2]/input";
    public static String Rdo_Female = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[5]/label[3]/input";
    public static String Address = "//*[@id='address']";
    public static String DD_Country = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[4]/select";
    public static String Ford = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[8]/select/option[1]";
    public static String Toy = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[8]/select/option[2]";
    public static String BMW = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[8]/select/option[3]";
    public static String Add_Name = "//*[@id='contactPersonName']";
    public static String Add_Number = "//*[@id='contactPersonPhone']";
    public static String Privacy_Policy = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[16]/label/input";
    public static String Submit = "//*[@id='formSubmit']";
    public static String Reset = "//*[@id='formReset']";
    public static String Refresh = "//*[@id='formRefresh']";
    public static String Third_Party = "//*[@id='thirdPartyButton']";
    public static String Related_Docs = "//*[@id='quoteForm']/fieldset/section/div/div[2]/div/div[11]/button";
    public static String Final_Msg = "//*[@id='quotePageResult']/fieldset/legend";

    public static void enter_valid_TextBox_details() throws IOException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Create an Actions object
        WebElement initialElement = driver.findElement(By.xpath(Name));
        Actions actions = new Actions(driver);
        // Perform the sequence of actions
        actions.click(initialElement)
                .sendKeys(" ")  // Press space
                .sendKeys("firstname")  // Enter first text
                .sendKeys("\t")  // Press Tab
                .sendKeys("MiddleName")  // Enter second text
                .sendKeys("\t")  // Press Tab again
                .sendKeys("ThirdName")  // Enter third text
                .sendKeys("\t")  // Press Tab again
                .sendKeys("\n")  // Press Enter
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.findElement(By.xpath(Password)).sendKeys("@ryan291121");
        driver.findElement(By.xpath(Email)).sendKeys("Test@test.com");
        driver.findElement(By.xpath(Phone_Number)).sendKeys("07442235829");
        driver.findElement(By.xpath(Conform_Password)).sendKeys("@ryan291121");
        driver.findElement(By.xpath(Address)).sendKeys("548 CBRoad,Ilford,IG26RE");
        driver.findElement(By.xpath(Rdo_Male)).click();
        driver.findElement(By.xpath(User_Name)).sendKeys("Ajju123");
      //  enterText(By.xpath(Email),"Test@test.com");
      //  enterText(By.xpath(Conform_Password),"@ryaN291121");
      //  enterText(By.xpath(Password),"@ryaN2911");
      //  enterText(By.xpath(Phone_Number),"07442235830");
      //  enterText(By.xpath(Address),"570 cranbrook road,Ilford,IG26RE");
      //  click(By.xpath(Rdo_Male));//driver.findElement(By.xpath(Rdo_Male)).click();
      //  enterText(By.xpath(User_Name),"Ajju123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Country_Dropdown() throws IOException {

        //selectDropdown(By.xpath(DD_Country),"United Kingdom");

        // Locate the dropdown element by its ID (or another attribute)
        WebElement dropdownElement = driver.findElement(By.xpath(DD_Country));
        // Create a Select object
        Select dropdown = new Select(dropdownElement);
        // Select the option by visible text
        dropdown.selectByVisibleText("United Kingdom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }


    public static void Third_Party() throws IOException {
        // Optional: Wait for a few seconds to see the selection (not recommended for production)
        driver.findElement(By.xpath(Third_Party)).click();
//        click(By.xpath(Third_Party));
//        acceptAlert();
        // Switch to the alert
        Alert alert = driver.switchTo().alert();
        // Accept the alert
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Next_tab() throws IOException {
//        switchToNextTab(By.xpath(Related_Docs));
        driver.findElement(By.xpath(Related_Docs)).click();
//        // Store the current window handle
        String parentWindowHandle = driver.getWindowHandle();
//        // Perform the action that opens a new tab (e.g., clicking a link that opens a new tab)
//        // Get all window handles
        ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
//        // Switch to the new tab (the second window handle)
        driver.switchTo().window(windowHandles.get(1));
//        // Perform actions in the new tab
//        // For example, navigate to a different URL or interact with elements in the new tab
        driver.get("https://skryabin.com/market/new_window.html");
        driver.close();
//        // Optional: Wait for a few seconds to see the result (not recommended for production)
//        // Switch back to the parent tab
        driver.switchTo().window(parentWindowHandle);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void DOB() throws IOException {
//        click(By.xpath(DOB));
//        clearText(By.xpath(DOB));
//        enterText(By.xpath(DOB),"25-07-1991");
        driver.findElement(By.xpath(DOB)).click();
        driver.findElement(By.xpath(DOB)).clear();
        driver.findElement(By.xpath(DOB)).sendKeys("25-07-1991");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Frame() throws IOException {
//        switchToFrame(By.name("additionalInfo"));
//        enterText(By.xpath(Add_Name),"Test Additional");
//        enterText(By.xpath(Add_Number),"07442235826");
//        switchToDefaultContent();
//// Switch to the iframe using its ID or name attribute
        driver.switchTo().frame("additionalInfo");
        // Locate the text box inside the iframe
        WebElement textBox = driver.findElement(By.xpath(Add_Name));
//        // Clear the text box and send new text
//        textBox.clear();
//        textBox.sendKeys("Test Additional");
        WebElement textBox1 = driver.findElement(By.xpath(Add_Number));
//        // Clear the text box and send new text
        textBox1.clear();
        textBox1.sendKeys("07442235829");
//        Switch back to the main content
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Privacy_Policy() throws IOException {
//        click(By.xpath(Privacy_Policy));
//        click(By.xpath(Submit));
        driver.findElement(By.xpath(Privacy_Policy)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath(Submit)).click();
    }

    public static void Submit_Success() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        System.out.println("Post successful submission:");
        String result_message = driver.findElement(By.xpath(Final_Msg)).getText();
//        String result_message = getText(By.xpath(Final_Msg));
        assertEquals("Submitted Application", result_message);
        System.out.println(result_message);
    }

}