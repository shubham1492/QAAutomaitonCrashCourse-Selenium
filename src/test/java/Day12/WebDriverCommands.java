package Day12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Practice Exercise - 1
 * 1.	Launch a new Chrome browser.
 * 2.	Open https://shop.demoqa.com/
 * 3.	Get Page Title name and Title length
 * 4.	Print Page Title and Title length on the Eclipse Console.
 * 5.	Get Page URL and verify if it is a correct page opened
 * 6.	Get Page Source (HTML Source code) and Page Source length
 * 7.	Print Page Length on Console.
 * 8.	Close the Browser.
 *
 */
public class WebDriverCommands {
    public static void main(String[] args) {

// Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.com/";
        // Step3: Launch the uRl
        driver.get(url);

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        String currentUrl = driver.getCurrentUrl();
        if (url.equalsIgnoreCase(currentUrl)){
            System.out.println("Verification is successful");
        }else{
            System.out.println("verification is not successful");
        }

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        System.out.println(pageSource.length());

        driver.close();
    }
}
