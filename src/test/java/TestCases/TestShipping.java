package TestCases;

import Pages.ShippingPage;
//import Utilities.DataSet;
import Utilities.DataSet;
import Utilities.webdriverSetup;
//import junit.framework.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;
//import java.util.List;

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



    }


    @Test(dataProvider = "countryDataProvider", dataProviderClass = DataSet.class)
    public void testAddressSelection(String country, String city, String area, String courier) throws IOException, InterruptedException {
        testLogin.TestLogin();
        getBrowser().get("https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=");

        // Add a wait to ensure the page is loaded
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(shippingPage.getElement(shippingPage.CountryBox)));

        Select selectCountry = new Select(shippingPage.getElement(shippingPage.CountryBox));
        selectCountry.selectByVisibleText(country);

        if (country.equals("Bangladesh")) {
            // Wait for the city dropdown to be visible
            wait.until(ExpectedConditions.visibilityOf(shippingPage.getElement(shippingPage.CityBox)));

            // Select city
            Select selectCity = new Select(shippingPage.getElement(shippingPage.CityBox));
            selectCity.selectByVisibleText(city);

            // Wait for the area dropdown to be visible
            wait.until(ExpectedConditions.visibilityOf(shippingPage.getElement(shippingPage.AreaBox)));

            // Select area
            Select selectArea = new Select(shippingPage.getElement(shippingPage.AreaBox));
            selectArea.selectByVisibleText(area);

        } else {
            // Wait for the courier info box to be visible
            wait.until(ExpectedConditions.visibilityOf(shippingPage.getElement(shippingPage.courierInfoBox)));

            // Select courier service for India and other countries
            Select selectCourier = new Select(shippingPage.getElement(shippingPage.courierInfoBox));
            selectCourier.selectByVisibleText(courier);
        }


    }

}
