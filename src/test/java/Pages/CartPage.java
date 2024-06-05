package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasicPage {


    public By ScrollTo = By.xpath("//div[@class=\"books-wrapper row\"]");

    public By CartIcon = By.xpath("//img[@alt='cart']");
    public By PlaceOrderBtn = By.xpath("//span[normalize-space()='Place Order']");

    public By Book = By.xpath("//div[@title='শ্রেষ্ঠ প্রেমের উপন্যাস হুমায়ূন আহমেদ']//div[2]//p[1]");

    public By ClickAddToCart = By.xpath("//a[@class='btn details-cart-btn-new small-cart-button js--add-to-cart js--add-to-cart-desc']//span[@id='js--add-to-cart-button']");

}
