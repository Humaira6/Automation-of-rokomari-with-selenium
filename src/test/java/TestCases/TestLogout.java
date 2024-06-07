package TestCases;

import Pages.HomePage;
import Pages.Logout;
//import Utilities.SessionManager;
import Utilities.webdriverSetup;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLogout extends webdriverSetup {

    TestLogin login=new TestLogin();
    Logout logout=new Logout();

    HomePage homePage=new HomePage();

    @Test
    public void CheckLogout() throws IOException, InterruptedException {

        login.TestLogin();
        logout.clickOnElement(logout.profileDropDownBtn);
        Thread.sleep(2000);
        Actions actions=new Actions(getBrowser());
        actions.scrollByAmount(0,100).build().perform();
        actions.scrollToElement(getBrowser().findElement(logout.SignOutBtn)).build().perform();
        actions.click(getBrowser().findElement(logout.SignOutBtn)).build().perform();
        getBrowser().manage().deleteAllCookies();

        Thread.sleep(2000);
        //SessionManager sessionManager = new SessionManager(getBrowser());

        // Clear all cookies, local storage, and session storage to ensure the session is terminated
        getBrowser().manage().deleteAllCookies();
        //sessionManager.clearLocalStorage();
        //sessionManager.clearSessionStorage();

        // Refresh the page to ensure changes take effect
        getBrowser().navigate().refresh();

        Thread.sleep(2000);
        logout.addScreenshot("After Logout");

        // Verify if the user is logged out by checking the presence of a login button or absence of profile elements
        boolean isLoggedOut = getBrowser().findElements(homePage.SignInButton).size() > 0;

        Assert.assertTrue("User is not logged out successfully.", isLoggedOut);
    }

    }



