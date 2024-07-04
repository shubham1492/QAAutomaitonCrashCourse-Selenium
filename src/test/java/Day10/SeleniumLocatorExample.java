package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumLocatorExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        // Step3: Launch the uRl
        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("shubham");

        driver.findElement(By.name("gender")).click();

        WebElement element = driver.findElement(By.className("practice-form-wrapper"));

        driver.findElement(By.linkText("Home")).click();

        driver.findElement(By.partialLinkText("Ho")).click();

        List<WebElement> elementList = driver.findElements(By.tagName("a"));

        driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("shubhamjain55@gmail.com");

        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@mail.com");
    }


}
