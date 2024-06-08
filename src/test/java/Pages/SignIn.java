package Pages;

import org.openqa.selenium.By;

public class SignIn extends BasicPage{

public By EmailInputBox= By.xpath("//input[@placeholder='Email or phone']");

public By NextButton=By.xpath("//button[@id='js--btn-next']");

public By OTPInputBox=By.xpath("//input[@placeholder='OTP']");

public By LoginButton=By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");

}
