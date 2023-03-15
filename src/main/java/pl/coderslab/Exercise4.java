package pl.coderslab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Wyszukiwanie elementów po xPath
public class Exercise4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/div[1]")); // checkbox Mrs/Mr
        driver.findElement(By.xpath("//*[@id=\"field-firstname\"]")); // firstName Input
        driver.findElement(By.xpath("//*[@id=\"field-lastname\"]")); // lastNameInput
        driver.findElement(By.xpath("//*[@id=\"field-email\"]")); // emailInput
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")); // passwordInput
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[5]/div[1]/div/span/button")); //showButton
        driver.findElement(By.xpath("//*[@id=\"field-birthday\"]")); // birthDate
        driver.quit();




    }
}
