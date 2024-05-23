package TestCases;

import Pages.BookPage;
import Pages.HomePage;
import Pages.SignIn;
import Utilities.webdriverSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSelectWriter extends webdriverSetup {

    HomePage homePage = new HomePage();
    SignIn signIn = new SignIn();
    BookPage bookPage = new BookPage();
    TestLogin testLogin=new TestLogin();


    @Test
    public void SelectWriter() throws IOException, InterruptedException {
        testLogin.TestLogin();
       // bookPage.clickOnElement(bookPage.writer);
       // Thread.sleep(3000);
        Actions actions=new Actions(getBrowser());
        actions.scrollToElement(getBrowser().findElement(bookPage.writer)).build().perform();
        actions.clickAndHold(bookPage.getElement(bookPage.writer)).build().perform();
       // actions.scrollByAmount(0,100).build().perform();
        //Thread.sleep(3000);
        //actions.scrollToElement(getBrowser().findElement(bookPage.writer)).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.scrollToElement(getBrowser().findElement(bookPage.Humayun)).build().perform();
        //Thread.sleep(3000);
        actions.click(bookPage.getElement(bookPage.Humayun)).build().perform();
        Thread.sleep(3000);





    }

}
