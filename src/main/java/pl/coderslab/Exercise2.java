package pl.coderslab;


import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Exercise2 {
    public static void main(String[] args) {
// Wyszukiwanie elementów na stronach oraz cofanie się do poprzednich stron
        System.setProperty("webdriver.safari.driver",
                "src/main/resources/driver/safaridriver");
        SafariOptions options = new SafariOptions();
        SafariDriver driver = new SafariDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.quit();
    }

}
