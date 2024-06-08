package TestCases;

import Pages.BookPage;
import Pages.HomePage;
import Pages.SignIn;
//import Utilities.SessionManager;
import Utilities.webdriverSetup;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLogin extends webdriverSetup {

    HomePage homePage = new HomePage();
    SignIn signIn=new SignIn();
    BookPage bookPage=new BookPage();


    @Test

    public void TestLogin() throws IOException, InterruptedException {
//        getBrowser().get(homePage.URL);
//        homePage.clickOnElement(homePage.SignInButton);
//        signIn.writeOnElement(signIn.EmailInputBox, "humairagulshan2807@gmail.com");
//        signIn.clickOnElement(signIn.NextButton);
//        Thread.sleep(15000);
//        signIn.writeOnElement(signIn.OTPInputBox, "3889");
//        Thread.sleep(5000);
////
//        signIn.clickOnElement(signIn.LoginButton);

        getBrowser().get("https://www.rokomari.com/my-section/profile");
        Thread.sleep(3000);
        bookPage.clickOnElement(bookPage.BookBtn);

        Thread.sleep(3000);


    }


}
