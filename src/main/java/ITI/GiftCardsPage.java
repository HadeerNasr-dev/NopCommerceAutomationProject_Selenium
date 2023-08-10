package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardsPage {
    private WebDriver driver;
    private By addToCartButton= By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public GiftCardsPage(WebDriver driver) {
        this.driver= driver;
    }
    public PhysicalGiftCardPage clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
        return new PhysicalGiftCardPage(driver);
    }

}
