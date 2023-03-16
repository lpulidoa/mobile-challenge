package adapter.screens;

import adapter.bases.BaseMobileScreen;
import io.appium.java_client.android.AndroidDriver;

public class LoginScreen extends BaseMobileScreen {
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    private final String skipSignInButtonId = "com.imdb.mobile:id/splash_not_now";

    public GlobalNavigationScreen skipSignIn(){
        locateElementUiSelector(skipSignInButtonId)
                .click();
        return new GlobalNavigationScreen(driver);
    }
}
