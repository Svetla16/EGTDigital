package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By shoppingCartLink = By.className("shopping_cart_link");


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack(){
        driver.findElement(backpack).click();
    }

    public void addBikeLight(){
        driver.findElement(bikeLight).click();
    }
    public CartPage clickShoppingCart(){
        driver.findElement(shoppingCartLink).click();
        return new CartPage(driver);
    }


}
