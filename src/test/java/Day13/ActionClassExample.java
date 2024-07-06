package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/newtours/";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement  element = driver.findElement(By.linkText("Home"));

        Actions actions = new Actions(driver);

        Action mouseOver = actions.moveToElement(element).build();

        WebElement element1 = driver.findElement(By.xpath("//tr[@class='mouseOut'][1]"));

        String bgColor = element1.getCssValue("background-color");

        System.out.println("Before Mouse Over"+ bgColor);

        mouseOver.perform();

        bgColor = element1.getCssValue("background-color");

        System.out.println("After Mouse Over"+ bgColor);


    }
}
