package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NoteBooksPage {
    private  WebDriver driver;
    private By addToCartbutton= By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By statusAlert= By.id("bar-notification");
    private By deleteTheMessage= By.cssSelector("span[title='Close']");
    public NoteBooksPage(WebDriver driver){
        this.driver= driver;
    }
   public void clickAddToCart(){
        driver.findElement(addToCartbutton).click();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert));
   }
   public String getAlertText(){
         return driver.findElement(statusAlert).getText();
   }
   public void clickDeleteTheMessage(){
        driver.findElement(deleteTheMessage).click();
   }
}
