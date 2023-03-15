package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageSteps {

    public static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage()
                .window()
                .maximize();
        driver.navigate()
                .to("https://www.wikipedia.org/");
    }

    @After
    public void tearDown(Scenario scenario){
        //Aquí va el screenshot
        if(scenario.isFailed()){
            TakesScreenshot screenshotTaking = (TakesScreenshot) driver;
            byte[] screenshot = screenshotTaking.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of failed test case");
        }
        driver.quit();
    }
}
