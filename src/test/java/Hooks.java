import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Hooks {


    protected WebDriver driver = new ChromeDriver();
//    protected ChromeDriver driver;


    @BeforeMethod
    public void setUp(){
        driver.manage()
                .window()
                .maximize();
        driver.navigate()
                .to("https://www.wikipedia.org/");

//        driver = new ChromeDriver();
//        DevTools devTools = driver.getDevTools();
//        devTools.createSession();
//
//        driver.manage().window().maximize();
//        driver.navigate().to("https://www.wikipedia.org/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
