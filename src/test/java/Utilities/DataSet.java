package Utilities;

import Pages.BasicPage;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;


public class DataSet extends BasicPage {


    @DataProvider(name="InvalidCredentialsforShippingDetails")
    public static Object invalidData() {
        Object[][] data = {{"", "", "", ""},
                {"customer", "gdhhgf", "", ""},
                {"customer", "", "0172378972", ""},
                {"customer", "01732934752", "78972df", ""},
                {"customer", "01732934752", "0172378972", ""},

        };
        return data;

    }



    @DataProvider(name = "PaymentMethods")
    public static Object[][] getPaymentMethods() {
        return new Object[][]{
                {"Cash on Delivery", By.xpath("//label[@for='COD']")},

                {"Mobile Banking - bKash", By.xpath("//label[@for='B_KASH']")},
                {"Mobile Banking - Nagad", By.xpath("//label[@for='NAGAD']")},
                {"Mobile Banking - Rocket", By.xpath("//label[@for='ROCKET']")},


                {"Debit/Credit Card", By.xpath("//label[@for='SSL_COMMEREZ']")}

        };
    }











}
