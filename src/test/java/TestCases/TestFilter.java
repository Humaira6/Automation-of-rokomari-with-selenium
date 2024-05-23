package TestCases;

import Pages.Authors;
import Pages.CartPage;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class TestFilter extends webdriverSetup {


TestSelectWriter testSelectWriter=new TestSelectWriter();
Authors authors=new Authors();
CartPage cartPage=new CartPage();



@Test
    public void CheckFilter() throws InterruptedException, IOException {
    testSelectWriter.SelectWriter();
    //Thread.sleep(3000);
    Actions actions=new Actions(getBrowser());
    actions.scrollToElement(getBrowser().findElement(authors.ShopByCategories)).build().perform();
    actions.scrollByAmount(0,250).build().perform();
    //Thread.sleep(3000);
    actions.click(getBrowser().findElement(authors.SomoKalinUpponnash)).build().perform();
    actions.click(getBrowser().findElement(authors.RoChonaSongkolonOSomogro)).build().perform();
    //Thread.sleep(3000);
//    getBrowser().switchTo().newWindow(WindowType.WINDOW);
//    getBrowser().get("https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=677&categoryIds=1321&priceRange=0to45100&discountRange=0to40&page=2");
//   // actions.scrollToElement(getBrowser().findElement(cartPage.AddToCart));
//    Thread.sleep(3000);
//    actions.scrollToElement(getBrowser().findElement(cartPage.ScrollElementForView)).build().perform();
//    actions.click(getBrowser().findElement(cartPage.viewDetails)).build().perform();
//    actions.scrollToElement(getBrowser().findElement(cartPage.AddToCartBtn)).build().perform();
//    actions.click(getBrowser().findElement(cartPage.AddToCartBtn)).build().perform();
//    Thread.sleep(3000);
//    actions.click(getBrowser().findElement(cartPage.CartIcon)).build().perform();
//    Thread.sleep(3000);
    actions.scrollToElement(getBrowser().findElement(authors.NextBtn)).build().perform();
    actions.scrollByAmount(0,200).build().perform();
    Thread.sleep(2000);
    actions.click(getBrowser().findElement(authors.NextBtn)).build().perform();
    Thread.sleep(4000);


}


}
