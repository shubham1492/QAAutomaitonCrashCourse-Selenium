package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/delete_customer.php";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.name("cusid")).sendKeys("1234");

        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();

        String alertMsg = driver.switchTo().alert().getText();

        if(alertMsg.equals("Customer Successfully Delete!")){
            System.out.println("user is deleted successfully");
        }else {
            System.out.println("not able to delete");
        }

        driver.switchTo().alert().accept();
    }
}
