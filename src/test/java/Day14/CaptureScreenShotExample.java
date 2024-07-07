package Day14;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShotExample {
    public static void main(String[] args) throws IOException {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.in/";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot =  ((TakesScreenshot)driver);

        File screenshot  = takesScreenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot,new File("D:\\JAVA- Selenium\\Selenium Content\\Day 11\\amazonHomePage.png"));

    }
}
