package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasicPage {

    public By viewDetailsBtn = By.xpath("//div[@title='বসন্ত বিলাপ হুমায়ূন আহমেদ']//a[@class='btn home-details-btn btn-block transparent-background'][normalize-space()='View Details']");
    public By ScrollTo = By.xpath("//div[@class=\"books-wrapper row\"]");
    public By Book = By.xpath("//h4[contains(text(),'তন্দ্রাবিলাস')]");
    public By AddToCartBtn = By.cssSelector("body > div:nth-child(18) > section:nth-child(2) > section:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > a:nth-child(2) > span:nth-child(2)");

    public By ShareBtn = By.xpath("//div[@class='share-info']//div[@class='d-flex align-items-center']");
    public By CartIcon = By.xpath("//img[@alt='cart']");
    public By PlaceOrderBtn=By.xpath("//span[normalize-space()='Place Order']");

}
