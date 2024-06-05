package TestCases;

import Pages.BookPage;
import Pages.HomePage;
import Utilities.webdriverSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSelectWriter extends webdriverSetup {

    BookPage bookPage = new BookPage();
    TestLogin testLogin=new TestLogin();


    @Test
    public void SelectWriter() throws IOException, InterruptedException {
        testLogin.TestLogin();

        Actions actions=new Actions(getBrowser());
        actions.scrollToElement(getBrowser().findElement(bookPage.writer)).build().perform();
        actions.clickAndHold(bookPage.getElement(bookPage.writer)).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.scrollToElement(getBrowser().findElement(bookPage.Humayun)).build().perform();
        actions.click(bookPage.getElement(bookPage.Humayun)).build().perform();
        bookPage.addScreenshot("After writer selection");
        Thread.sleep(3000);





    }


}
