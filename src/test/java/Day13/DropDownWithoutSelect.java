package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelect {
    public static void main(String[] args) {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/newtours/register.php";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("country"));

        element.click();

        List<WebElement> elementList = driver.findElements(By.xpath("//select[@name=\"country\"]/option"));

        System.out.println(elementList.size());

        for (int i=0;i<elementList.size();i++){
            if(elementList.get(i).getText().equals("INDIA")){
                elementList.get(i).click();
                break;
            }
        }

    }
}
