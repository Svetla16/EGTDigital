package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    private By checkout = By.id("checkout");
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkout(){
        driver.findElement(checkout).click();
    }

    public CheckoutOnePage clickCheckoutButton(){
        driver.findElement(checkout).click();
        return new CheckoutOnePage(driver);
    }
}
