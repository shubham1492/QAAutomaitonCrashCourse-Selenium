package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleExample2 {
    public static void main(String[] args) {
        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/browser-windows";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        String mainWindow =  driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();

        Set<String> set = driver.getWindowHandles();

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){

            String childWindow = itr.next();

            if(!mainWindow.equalsIgnoreCase(childWindow)){

                driver.switchTo().window(childWindow);

                String title = driver.findElement(By.id("sampleHeading")).getText();

                System.out.println(title);

                driver.switchTo().window(mainWindow);

                driver.quit();

            }
        }

    }
}
