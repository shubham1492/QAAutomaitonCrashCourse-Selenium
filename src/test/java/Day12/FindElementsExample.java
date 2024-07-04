package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        // Step3: Launch the uRl
        driver.get("https://demoqa.com/text-box/");

        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("input"));

        if(elements.size() !=0){
            System.out.println(elements.size());

            for(WebElement element1 : elements){
                System.out.println(element1.getAttribute("placeholder"));
            }
        }



    }
}
