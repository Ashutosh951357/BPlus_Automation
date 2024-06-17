package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BrowserDriver {

        public static String select_country_code_xpath="//*[@id=\"selectID\"]/div[3]/i";
        public static String select_country_xpath="//*[@id=\"country_list\"]/div/div[1]/div[2]";
        public static String benepikplus_phonenumber_xpath="//*[@id=\"inputID\"]";
        public static String submit_Phonenumber_xpath="//*[@id=\"loginSubmitID\"]";
        public static String Handle_Notifiaction_xpath="/html/body/app-root/div/app-newmain/div[2]/div/div[1]/div/div/div/app-newlogin/div[2]/div/div/div[3]/button[1]";
        public static String Confirm_Login_OTP_xpath="//*[@id=\"submitOtpId\"]";




    public static void Bpluslogin() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath(select_country_code_xpath)).click();

            driver.findElement(By.xpath(select_country_xpath)).click();

            driver.findElement(By.xpath(benepikplus_phonenumber_xpath)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(benepikplus_phonenumber_xpath)).sendKeys("9953272445");

        }
        public static void SubmitPhonenumber() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath(submit_Phonenumber_xpath)).click();
        driver.findElement(By.xpath(Handle_Notifiaction_xpath)).click();
        Thread.sleep(18000);
        driver.findElement(By.xpath(Confirm_Login_OTP_xpath)).click();
        }
    }

