package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class CheckoutCompletePage {



    private WebDriver driver;

    private By burgerMenu = By.id("react-burger-menu-btn");
    private By logout = By.id("logout_sidebar_link");




    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
    }

    public void setBurgerMenu(){
        driver.findElement(burgerMenu).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickLogout(){
        driver.findElement(logout).click();
    }



}
