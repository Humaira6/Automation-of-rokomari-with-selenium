package Pages;

import org.openqa.selenium.By;

public class BookPage extends BasicPage{

    public By writer=By.xpath("//a[@id='js--authors']");
    public By Humayun=By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
}
