package pl.coderslab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
// Wyszukiwanie elemntów na stronie za pomocą xPath
public class Exercise1OtherOption {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"_desktop_logo\"]/a/img")).click();
        driver.quit();

    }
}
