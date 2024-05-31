package TestCases;

import Pages.ShippingPage;
import Utilities.webdriverSetup;
import junit.framework.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class TestConfirmOrder extends webdriverSetup {

    TestLogin testLogin = new TestLogin();
    ShippingPage shippingPage = new ShippingPage();

   @Test
    public void confirmOrderWithoutDetailsInfo() throws IOException, InterruptedException {
        testLogin.TestLogin();
        getBrowser().get("https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=");
        Thread.sleep(3000);
        Actions actions=new Actions(getBrowser());
        actions.scrollToElement(getBrowser().findElement(shippingPage.confirmOrderBtn)).build().perform();

       shippingPage.clickOnElement(shippingPage.confirmOrderBtn);

       String Message = shippingPage.getElement(shippingPage.errorMessage).getText();
       System.out.println(Message);



    }

}
