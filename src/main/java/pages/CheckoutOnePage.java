package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage {

    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By zipCodeField = By.id("postal-code");
    private By buttonContinue = By.id("continue");

    public CheckoutOnePage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setZipCode(String zipCode){
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public CheckoutTwoPage clickContinueButton(){
        driver.findElement(buttonContinue).click();
        return new CheckoutTwoPage(driver);
    }
}
