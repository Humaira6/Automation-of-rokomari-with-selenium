package TestCases;

import Utilities.DataSet;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPaymentMethod extends webdriverSetup {
   // PaymentMethod paymentMethod=new PaymentMethod();

    TestLogin testLogin=new TestLogin();

    @Test(dataProvider = "PaymentMethods", dataProviderClass = DataSet.class)
    public void TestPayment(String paymentMethodName, By paymentMethodLocator) throws IOException, InterruptedException {
        // Perform login
        testLogin.TestLogin();

        // Navigate to the payment page
        getBrowser().get("https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=");
        Thread.sleep(3000);

        // Scroll down to ensure the payment method options are in view
        Actions actions = new Actions(getBrowser());
        actions.scrollByAmount(0, 250).perform();

        // Find the radio button for the specified payment method
        WebElement paymentMethodElement = getBrowser().findElement(paymentMethodLocator);



        // Move to the element and click it
        actions.moveToElement(paymentMethodElement).click().perform();
        actions.scrollByAmount(0, 250).perform();
        Thread.sleep(3000);


    }







}
