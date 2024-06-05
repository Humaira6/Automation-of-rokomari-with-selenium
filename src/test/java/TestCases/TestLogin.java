package TestCases;

import Pages.HomePage;
import Utilities.SessionManager;
import Utilities.webdriverSetup;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLogin extends webdriverSetup {

    HomePage homePage = new HomePage();



    @Test

    public void TestLogin() throws IOException, InterruptedException {
        getBrowser().get(homePage.URL);
        SessionManager sessionManager = new SessionManager(getBrowser());
//        homePage.clickOnElement(homePage.SignInButton);
//        signIn.writeOnElement(signIn.EmailInputBox,"humairagulshan2807@gmail.com");
//        signIn.clickOnElement(signIn.NextButton);
//        Thread.sleep(3000);
//        signIn.writeOnElement(signIn.OTPInputBox,"2783");
//
//        signIn.clickOnElement(signIn.LoginButton);
//
//        sessionManager.storeSessionFile("rokomari","humairagulshan2807@gmail.com");

        sessionManager.usePreviousLoggedInSession("rokomari");
        Thread.sleep(3000);
//

    }


}
