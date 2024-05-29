package Pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasicPage{

    public String Name="Humaira";
    public String PhoneNum="01772978972";
    public String AlternativePhoneNum="";

    public String Address="House 78/79";
    public By NameBox=By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
public By PhoneNoInputBox= By.xpath("//fieldset[@class='group']//input[@id='phone']");
public By AlternativePhoneNoBox=By.xpath("//fieldset[@class='group']//input[@id='phone2']");
public By CountryBox=By.xpath("//select[@id='js--country']");
public By CityBox=By.xpath("//select[@id='js--city']");

//public By DhakaCity=By.xpath("")
public By AreaBox=By.xpath("//select[@id='js--area']");
public By AddressBox=By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");


}
