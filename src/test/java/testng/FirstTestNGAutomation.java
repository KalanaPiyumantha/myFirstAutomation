package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class FirstTestNGAutomation {
    WebDriver driver;
    @BeforeSuite
    public void init(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();
    }
    public void googleSearch() {

         driver.get("https://www.google.com");
         driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).click();
         driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).clear();
         driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).sendKeys("Selenium");
         driver.findElement(By.cssSelector("//a[@href='https://www.selenium.dev/")).click();
driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).click();


    }
    @AfterSuite
    public void guit(){
        driver.quit();
    }
}
