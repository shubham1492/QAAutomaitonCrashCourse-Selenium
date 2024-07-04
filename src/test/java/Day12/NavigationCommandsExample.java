package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/books";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        driver.navigate().back();

        driver.navigate().forward();

        driver.findElement(By.linkText("Git Pocket Guide")).click();

        driver.navigate().to(url);

        driver.navigate().refresh();

        driver.close();
    }
}
