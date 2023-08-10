package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PhysicalGiftCardPage {
    private WebDriver driver;
    private By recipientNameField= By.id("giftcard_45_RecipientName");
    private By yourNameField= By.id("giftcard_45_SenderName");
    private By addTocart= By.id("add-to-cart-button-44");
    private By addToCartButton =By.xpath("//button[@id='add-to-cart-button-45']");
    private By statusAlert= By.cssSelector(".bar-notification.error");

    public PhysicalGiftCardPage(WebDriver driver){
        this.driver= driver;
    }
    public void setRecipientNameField(String recipientname)
    {driver.findElement(recipientNameField).sendKeys(recipientname);}
    public void setYourNameField(String yourname){
        driver.findElement(yourNameField).sendKeys(yourname);
    }
    public PhysicalGiftCardPage clickAddToCart(){
        driver.findElement(addTocart).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert));
        return new PhysicalGiftCardPage (driver);
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
