package Pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasicPage {

    public By NameBox = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By PhoneNoInputBox = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By AlternativePhoneNoBox = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By CountryBox = By.xpath("//select[@id='js--country']");
    public By CityBox = By.xpath("//select[@id='js--city']");

    public By AreaBox = By.xpath("//select[@id='js--area']");

    public By courierInfoBox = By.xpath("//select[@id='js--courier']");
    //public By confirmOrderBtn = By.xpath("//span[normalize-space()='Confirm Order']");

    public By confirmOrderBtn=By.cssSelector("#js--total-amount-confirm-btn");
    public By errorMessage = By.xpath("//span[@class='text-danger js--require-msg mr-3 ']");


}
