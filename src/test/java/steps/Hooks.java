package steps;

import helpers.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private WebDriver driver;
    private DriverHelper driverHelper;
    public Hooks(DriverHelper driverHelper) {

        this.driverHelper = driverHelper;

    }

    @Before
    public void setUp(){
        driverHelper.setDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
