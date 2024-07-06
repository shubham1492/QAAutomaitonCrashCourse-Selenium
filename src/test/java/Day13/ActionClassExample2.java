package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample2 {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("email"));

        WebElement password  = driver.findElement(By.name("pass"));

        Actions  actions = new Actions(driver);

        actions.moveToElement(username)
                .click()
                .sendKeys("xyz@gmail.com")
                .keyDown(Keys.TAB)
                .sendKeys("temp@123")
                .contextClick()
                .build()
                .perform();

    }
}
