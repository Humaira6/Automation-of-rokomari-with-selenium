package Pages;

import org.openqa.selenium.By;

public class PaymentMethod extends BasicPage{
    public By PaymentMethodCOD=By.xpath("//p[contains(text(),'ক্যাশ অন ডেলিভারি')]");
    public By CODBtn=By.xpath("//label[@for='COD']");

}
