package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage {

    private WebDriver driver;
    private By finish = By.id("finish");

    public CheckoutTwoPage(WebDriver driver){
        this.driver = driver;
    }

    public CheckoutCompletePage clickFinishButton(){
        driver.findElement(finish).click();
        return new CheckoutCompletePage(driver);
    }
}
