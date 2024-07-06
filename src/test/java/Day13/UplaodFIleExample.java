package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodFIleExample {

    public static void main(String[] args) throws InterruptedException {

        // Step1 : set the property for driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");

        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/upload/";
        // Step3: Launch the uRl
        driver.get(url);
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.className("upload_txt"));

        element.sendKeys("D:\\JAVA- Selenium\\Selenium Content\\Day 8  & 9\\Day 24- How to Upload File in Selenium.docx");

       driver.findElement(By.className("field_check")).click();

       driver.findElement(By.id("submitbutton")).click();

        Thread.sleep(5000);

       String text = driver.findElement(By.xpath("//h3[@class='demo']/center")).getText();

        System.out.println(text);

        if(text.equals("1 file\n" +
                "has been successfully uploaded.")){
            System.out.println("File uplaod successfully");
        }else{
            System.out.println("file not uploaded successfully");
        }
    }
}
