package pl.coderslab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    // Uzupełnianie formularza rejestracji
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstName.sendKeys("Karol");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        lastName.sendKeys("Kowalski");
        WebElement genderCheck = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        genderCheck.click();
        WebElement dateOfBirth = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        dateOfBirth.sendKeys("05/22/2010");
        WebElement adress = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        adress.sendKeys("Prosta 51");
        WebElement email =  driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("karol.kowalski@mailinator.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Pass123");
        WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        company.sendKeys("Coders Lab");
        WebElement comment = driver.findElement(By.xpath("//*[@id=\"comment\"]"));
        comment.sendKeys("To jest mój pierwszy automat testowy");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        driver.quit();

    }
}
