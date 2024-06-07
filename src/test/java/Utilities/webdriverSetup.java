package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class webdriverSetup {
    public static String browserName = System.getProperty("browserName", "Chrome for Testing");
    public static final ThreadLocal<WebDriver> LOCAL_BROWSER = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }

    public static void setBrowser(WebDriver browser) {
        webdriverSetup.LOCAL_BROWSER.set(browser);
    }

    public WebDriver getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome for Testing")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\Users\\Admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
            chromeOptions.addArguments("user-data-dir=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
            return new ChromeDriver(chromeOptions);
        } else if (browserName.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else if (browserName.equalsIgnoreCase("Edge"))
            return new EdgeDriver();
        else {
            throw new RuntimeException("Browser is not available with the given Name " + browserName);
        }


    }

    @BeforeSuite

    public void openBrowser() {
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.setBinary("C:\\Users\\Admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        //chromeOptions.addArguments("user-data-dir=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
        WebDriver browser = getBrowser(browserName);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.manage().window().maximize();
        setBrowser(browser);

    }


    @AfterSuite
    public void quitBrowser() {
        getBrowser().quit();
    }
}
