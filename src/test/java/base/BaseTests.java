package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    public WebDriver driver;
    protected LoginPage loginPage;



    @BeforeClass
    public void setUpClass(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }

    @BeforeMethod
    public void setUp() throws Exception{
        this.driver = new ChromeDriver();
        this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs", "Title not found.");
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDownTest() throws Exception{
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void tearDownClass() throws Exception{
        //Clean any generated test data
    }


}
