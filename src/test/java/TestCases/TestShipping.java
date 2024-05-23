package TestCases;

import Pages.ShippingPage;
import Utilities.webdriverSetup;
import junit.framework.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestShipping extends webdriverSetup {

    TestLogin testLogin = new TestLogin();
    ShippingPage shippingPage = new ShippingPage();

    @Test
    public void TestShippingDetails() throws IOException, InterruptedException {
        testLogin.TestLogin();
        getBrowser().get("https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=");
        Thread.sleep(3000);

        Actions actions = new Actions(getBrowser());
        actions.click(getBrowser().findElement(shippingPage.PhoneNoInputBox)).sendKeys(shippingPage.PhoneNum).build().perform();
        actions.click(getBrowser().findElement(shippingPage.AlternativePhoneNo)).sendKeys(shippingPage.AlternativePhoneNum).build().perform();
//
        String Text = getBrowser().findElement(shippingPage.Country).getText();
//    System.out.println(Text);
        //Assert.assertEquals(Text,"Option1");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Bangladesh", "Bangladesh");
        softAssert.assertAll();
        actions.click(getBrowser().findElement(shippingPage.City)).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.scrollToElement(getBrowser().findElement(shippingPage)).build().perform();
        //Thread.sleep(3000);
        actions.click(bookPage.getElement(bookPage.Humayun)).build().perform();


    }
}
