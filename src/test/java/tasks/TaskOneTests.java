package tasks;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TaskOneTests extends BaseTests {


    @Test
    public void testTaskOne() {
        //Log in with listed users on the page
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        InventoryPage inventoryPage = loginPage.clickLoginButton();
        //Add two items to the cart
        inventoryPage.addBackpack();
        inventoryPage.addBikeLight();
        CartPage cartPage = inventoryPage.clickShoppingCart();
        //Proceed to checkout
        CheckoutOnePage checkoutOnePage = cartPage.clickCheckoutButton();
        checkoutOnePage.setFirstName("Svetla");
        checkoutOnePage.setLastName("Dimitrova");
        checkoutOnePage.setZipCode("1000");
        CheckoutTwoPage checkoutTwoPage = checkoutOnePage.clickContinueButton();
        /*
        Order confirmation before
        we finalize and log out
         */
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html", "Page not found.");
        //Finish the transaction
        CheckoutCompletePage checkoutComplete = checkoutTwoPage.clickFinishButton();
        //Logout
        checkoutComplete.setBurgerMenu();
        checkoutComplete.clickLogout();
    }
}
