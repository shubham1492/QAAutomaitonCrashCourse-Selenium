package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayExample {

    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/automation-practice-form";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement element  = driver.findElement(By.id(("firstName")));

        boolean textBoxStatus = element.isDisplayed();

        System.out.println(textBoxStatus);

        boolean enable  = element.isEnabled();

        System.out.println(enable);

        if(textBoxStatus && enable){
            element.sendKeys("shubham");
        }


    }
}
