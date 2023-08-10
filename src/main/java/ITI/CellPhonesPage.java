package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CellPhonesPage {
    private WebDriver driver;
    //private By addToCartButton= By.cssSelector("body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)");
    private By addToCartButton= By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private By statusAlert= By.cssSelector(".content");
    public CellPhonesPage(WebDriver driver) {
    }
    public CellPhonesPage clickAddToCartbutton(){
        driver.findElement(addToCartButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert));
        return new CellPhonesPage(driver);
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

}
