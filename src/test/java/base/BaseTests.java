package base;
import ITI.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
public class BaseTests {
    protected WebDriver driver;
    protected HomePage homepage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.drive", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
