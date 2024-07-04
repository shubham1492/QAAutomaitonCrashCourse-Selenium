package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        // Step3: Launch the uRl
        driver.get("https://demoqa.com/text-box/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("userName"));

        element.sendKeys("shubham Jain");

        driver.close();
    }

}
