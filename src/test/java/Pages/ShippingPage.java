package Pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasicPage{

    public String PhoneNum="01772978972";
    public String AlternativePhoneNum="";
public By PhoneNoInputBox= By.xpath("//fieldset[@class='group']//input[@id='phone']");
public By AlternativePhoneNo=By.xpath("//fieldset[@class='group']//input[@id='phone2']");
public By Country=By.xpath("//select[@id='js--country']");
public By City=By.xpath("//select[@id='js--city']");

//public By DhakaCity=By.xpath("")
public By Area=By.xpath("//select[@id='js--area']");
public By Address=By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
}
