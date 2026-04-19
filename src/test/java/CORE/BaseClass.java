package CORE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    ChromeOptions options;
   public static ChromeDriver driver;

   @BeforeMethod
    public void openDemoQA() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}