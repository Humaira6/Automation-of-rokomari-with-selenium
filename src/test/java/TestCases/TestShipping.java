package TestCases;

import Pages.ShippingPage;
import Utilities.DataSet;
import Utilities.webdriverSetup;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestShipping extends webdriverSetup {

    TestLogin testLogin = new TestLogin();
    ShippingPage shippingPage = new ShippingPage();



    @Test(dataProvider = "InvalidCredentialsforShippingDetails",dataProviderClass = DataSet.class)
    public void TestShippingDetails(String name,String phonenum,String alternativephonenum,String address) throws IOException, InterruptedException {
        testLogin.TestLogin();
        getBrowser().get("https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=");
        Thread.sleep(3000);

        shippingPage.clickOnElement((shippingPage.NameBox));
        shippingPage.getElement(shippingPage.NameBox).clear();
        shippingPage.writeOnElement(shippingPage.NameBox,name);
        shippingPage.writeOnElement(shippingPage.PhoneNoInputBox,phonenum);
        shippingPage.writeOnElement(shippingPage.AlternativePhoneNoBox,alternativephonenum);

        Select select=new Select(shippingPage.getElement(shippingPage.CountryBox));
        select.selectByVisibleText("Bangladesh");
//        Select countryDropdown = new Select(shippingPage.getElement(shippingPage.CountryBox));
//        countryDropdown.selectByVisibleText("Bangladesh");

        Select selectcity=new Select(shippingPage.getElement(shippingPage.CityBox));
        selectcity.selectByVisibleText("ঢাকা");
        //countryDropdown.selectByVisibleText("ঢাকা");

        select =new Select(getBrowser().findElement(By.id("js--area")));
        select.selectByVisibleText("মিরপুর-১     ");
        //countryDropdown.selectByVisibleText("মিরপুর-১     ");
        shippingPage.writeOnElement(shippingPage.AddressBox,address);
        Thread.sleep(3000);



    }

}
