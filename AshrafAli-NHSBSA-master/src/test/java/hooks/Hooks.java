package hooks;

import io.cucumber.java.After;
import utility.BrowserDriver;

public class Hooks {

    public static BrowserDriver driver;

    @After
    public void teardown() throws InterruptedException {
        driver.close();
    }

}
