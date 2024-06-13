package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class HomePage extends BrowserDriver {
    public static String benepikplus_selectcountry_xpath="//*[@id=\"countryId\"]";
    public static String country_continue_xpath="//*[@id=\"continueId\"]";

    public static void benepiklogo() throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.benepikplus.com");

        Thread.sleep(3000);
        driver.findElement(By.xpath(benepikplus_selectcountry_xpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(country_continue_xpath)).click();
    }
    }

