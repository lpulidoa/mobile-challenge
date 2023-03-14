package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper {
    private WebDriver driver;


    public void setDriver(){
        driver  = new ChromeDriver();
        driver.manage()
                .window()
                .maximize();
        driver.navigate()
                .to("https://www.wikipedia.org/");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
