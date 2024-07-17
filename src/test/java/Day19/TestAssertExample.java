package Day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertExample {

    WebDriver driver;


    @BeforeMethod
    public void setup(){
        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        // Step2 : Create Driver Object
        driver = new ChromeDriver();
    }

    @Test
    public  void testVerifyPageTitle(){
       driver.get("https://toolsqa.com/");
       String title = driver.getTitle();
       System.out.println(title);
       String expectedResult = "Tools QA";
       Assert.assertEquals(title,expectedResult,title+ " is not matching with the expected "+ expectedResult + "result");
    }


    @Test
    public  void testVerifyPageTitle1(){
        driver.get("https://toolsqa.com/");
        String title = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        System.out.println(title);
        String expectedResult = "Tools QA";
        softAssert.assertEquals(title,"ToolsQa");
        System.out.println("rest of the code");
        softAssert.assertEquals(title,expectedResult,title+ " is not matching with the expected "+ expectedResult + "result");
        softAssert.assertAll();
    }


}
