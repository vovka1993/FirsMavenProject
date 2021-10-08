import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver;

    @BeforeMethod
            public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
    }

    @AfterMethod
    void setDown() {
        driver.quit();
    }

    @Test
    public void testLoginError(){

            WebElement username = driver.findElement(By.id("user_email_login"));
            WebElement password = driver.findElement(By.id("user_password"));
            WebElement login = driver.findElement(By.name("commit"));

            username.sendKeys("abc@gmail.com");
            password.sendKeys("your_password");
            login.click();

            WebElement error = driver.findElement(By.id("bs-alert-text-id"));
            Assert.assertEquals(error.getText(), "There have been several failed attempts to sign in from this account. Please wait a while and try again later.");
        }

    
    @Test
    public void testNewPassword() {


            driver.get("https://www.browserstack.com/users/sign_in");
            WebElement link = driver.findElement(By.linkText("Forgot password?"));
            link.click();

            Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/password/new");
    }
}
