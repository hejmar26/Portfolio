package pl.coderslab;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.security.Signature;
import java.time.Duration;
import java.util.Random;

import static java.awt.SystemColor.control;
import static org.junit.Assert.assertTrue;

public class MyStoreTests {

    String email = "test@test" + new Random().nextInt(1000000) + ".com";

    @Test
    public void isPossibleToClickOnSignInButton() {
        System.setProperty("webdriver.safari.driver",
                "src/main/resources/driver/safaridriver");
        SafariDriver driver = new SafariDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().window().maximize();
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        assertTrue(signInButton.isDisplayed() && signInButton.isEnabled());
        signInButton.click();
        driver.quit();
    }


    @Test
    public void isPasswordFieldIsDisplayed() {

        System.setProperty("webdriver.safari.driver",
                "src/main/resources/driver/safaridriver");
        SafariDriver driver = new SafariDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().window().maximize();
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        signInButton.click();
        WebElement passwordInput = driver.findElement(By.id("field-password"));
        assertTrue(passwordInput.isDisplayed());
        driver.quit();
    }

    @Test
    public void isEmailFieldIsDisplayed() {
        System.setProperty("webdriver.safari.driver", "src/main/resources/driver/safaridriver");
        SafariDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signInbutton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        signInbutton.click();
        WebElement emailInput = driver.findElement(By.id("field-email"));
        assertTrue(emailInput.isDisplayed());
        driver.quit();
    }


}
