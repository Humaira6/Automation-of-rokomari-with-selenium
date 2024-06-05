package TestCases;

import Pages.Authors;
import Pages.CartPage;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class TestFilter extends webdriverSetup {


    TestSelectWriter testSelectWriter = new TestSelectWriter();
    Authors authors = new Authors();



    @Test
    public void CheckFilter() throws InterruptedException, IOException {
        testSelectWriter.SelectWriter();
        //Thread.sleep(3000);
        Actions actions = new Actions(getBrowser());
        actions.scrollToElement(getBrowser().findElement(authors.ShopByCategories)).build().perform();
        actions.scrollByAmount(0, 250).build().perform();
        //Thread.sleep(3000);

        authors.clickOnElement(authors.SomoKalinUpponnash);
        actions.scrollByAmount(0, 250).build().perform();
        authors.clickOnElement(authors.RoChonaSongkolonOSomogro);
        authors.addScreenshot("After Filter");
        actions.scrollToElement(getBrowser().findElement(authors.NextBtn)).build().perform();
        actions.scrollByAmount(0, 200).build().perform();
        actions.click(getBrowser().findElement(authors.NextBtn)).build().perform();
        Thread.sleep(2000);



    }


}
