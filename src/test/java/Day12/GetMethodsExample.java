package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.SortedMap;

public class GetMethodsExample {
    public static void main(String[] args) throws InterruptedException {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/links";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("bad-request"));

        element.click();

        Thread.sleep(5000);

        String label = driver.findElement(By.id("linkResponse")).getText();

        System.out.println(label);

        System.out.println("tagName: "+ element.getTagName());

        String cssValue =  element.getCssValue("color");

        System.out.println(cssValue);

        Dimension dimension = element.getSize();

        System.out.println(dimension.height + " "+ dimension.width);

    }
}
