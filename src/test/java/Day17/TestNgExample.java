package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExample {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        // Step2 : Create Driver Object
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actualTitle,expectedTitle);
        Reporter.log(actualTitle +" Matched with Expected Result Successfully");
    }

    @Test
    public void secondTest(){
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(actualTitle,expectedTitle);
        Reporter.log(actualTitle +" Matched with Expected Result Successfully");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
