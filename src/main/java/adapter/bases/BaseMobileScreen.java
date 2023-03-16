package adapter.bases;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseMobileScreen {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    public BaseMobileScreen(AndroidDriver driver)  {
        this.driver=driver;
    }

    public WebElement locateElementUiSelector(String resourceId) {
        return  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\""+resourceId+"\")");
    }

    public List<WebElement> locateElementsUiSelector(String resourceId) {
        return  driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\""+resourceId+"\")");
    }

    public void waitForElementPresence(String resourceId){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(locateElementUiSelector(resourceId)));
    }

    public void waitForElementClickable(String resourceId){
        waitForElementPresence(resourceId);
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(locateElementUiSelector(resourceId)));
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"Ok\")")
    public AndroidElement OkButton;

}


