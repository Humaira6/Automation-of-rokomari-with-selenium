package TestCases;

import Pages.BookPage;
import Pages.CartPage;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TestAddToCart extends webdriverSetup {


    CartPage cartPage = new CartPage();

    TestSelectWriter testSelectWriter = new TestSelectWriter();


    @Test
    public void CheckAddToCart() throws InterruptedException, IOException {

        testSelectWriter.SelectWriter();


        Actions actions = new Actions(getBrowser());
        actions.scrollByAmount(0, 150).build().perform();
        actions.scrollToElement(cartPage.getElement(cartPage.ScrollTo)).build().perform();

        actions.moveToElement(getBrowser().findElement(cartPage.Book)).click().perform();


        getBrowser().switchTo().newWindow(WindowType.TAB);
        getBrowser().get("https://www.rokomari.com/book/971/sheshtho-premer-uponnas");

        actions.scrollByAmount(0, 200).build().perform();
        Thread.sleep(3000);


        try {
            actions.scrollToElement(getBrowser().findElement(cartPage.ClickAddToCart)).build().perform();
            Thread.sleep(3000);
            cartPage.clickOnElement(cartPage.ClickAddToCart);
            Thread.sleep(3000);
            cartPage.clickOnElement(cartPage.CartIcon);
        } catch (Exception e) {
            // If "Add to Cart" button is not visible, click on "CartIcon for Go to the Cart" button

            cartPage.clickOnElement(cartPage.CartIcon);
        }

        Thread.sleep(2000);
        cartPage.addScreenshot("Before PlaceOrder");
        actions.moveToElement(getBrowser().findElement(cartPage.PlaceOrderBtn)).build().perform();
        cartPage.clickOnElement(cartPage.PlaceOrderBtn);
        Thread.sleep(2000);

    }

}
