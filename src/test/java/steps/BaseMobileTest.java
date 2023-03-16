package steps;


import core.ConfigCapabilities;
import core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseMobileTest {
    public static AndroidDriver<AndroidElement> driver;
    protected DesiredCapabilities capabilities = ConfigCapabilities.GetCapabilities();

    @Before
    public void SetUp(){
        driver = new MobileAppDriver().GetMoviesAppDriver(capabilities);
    }

    @After
    public void TearDown()
    {

    }
}



