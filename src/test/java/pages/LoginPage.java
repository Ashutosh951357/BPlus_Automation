package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BrowserDriver {

        public static String select_country_code_xpath="//*[@id=\"selectID\"]";
        public static String select_country_xpath="//*[@id=\"country_list\"]/div/div[1]";
        public static String benepikplus_phonenumber_xpath="//*[@id=\"inputID\"]";
        public static String submit_Phonenumber_xpath="//*[@id=\"loginSubmitID\"]";
        public static WebDriver driver;
        public static void Bpluslogin() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath(select_country_code_xpath)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(select_country_xpath)).click();
            driver.findElement(By.xpath(benepikplus_phonenumber_xpath)).click();
            driver.findElement(By.xpath(benepikplus_phonenumber_xpath)).sendKeys("9953272445");
            Thread.sleep(2000);
        }
        public static void SubmitPhonenumber() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath(submit_Phonenumber_xpath)).click();
        }
    }

