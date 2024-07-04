package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/automation-practice-form";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("firstName"));

        element.sendKeys("Shubham");

        element.clear();

        element.sendKeys("rahul");

        String attribute = element.getAttribute("placeholder");

        System.out.println(attribute);

        driver.close();



    }
}
