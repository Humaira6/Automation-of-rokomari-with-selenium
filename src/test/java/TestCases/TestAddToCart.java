package TestCases;

import Pages.CartPage;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAddToCart extends webdriverSetup {

    TestFilter testFilter=new TestFilter();
    CartPage cartPage=new CartPage();

    @Test
    public void CheckAddToCart() throws InterruptedException, IOException {
        testFilter.CheckFilter();
        Thread.sleep(3000);
        Actions actions=new Actions(getBrowser());
        actions.scrollByAmount(0,150).build().perform();
        //actions.scrollToElement(cartPage.getElement(cartPage.viewDetailsBtn)).build().perform();
        //actions.click(cartPage.getElement(cartPage.viewDetailsBtn)).build().perform();

        actions.scrollToElement(cartPage.getElement(cartPage.ScrollTo)).build().perform();
        actions.click(cartPage.getElement(cartPage.Book)).build().perform();
        getBrowser().switchTo().newWindow(WindowType.WINDOW);
        getBrowser().get("https://www.rokomari.com/book/1192/tandrabilas");
        actions.scrollToElement(getBrowser().findElement(cartPage.AddToCartBtn)).build().perform();
        actions.scrollByAmount(0,100).build().perform();
        //Thread.sleep(3000);
        actions.click(getBrowser().findElement(cartPage.AddToCartBtn)).build().perform();
       // actions.click(getBrowser().findElement(cartPage.AddToCartBtn)).build().perform();
        //Thread.sleep(3000);
        actions.click(cartPage.getElement(cartPage.CartIcon)).build().perform();
        //Thread.sleep(4000);
        actions.click(getBrowser().findElement(cartPage.PlaceOrderBtn)).build().perform();
        //Thread.sleep(3000);


       // Thread.sleep(3000);









    }

}
