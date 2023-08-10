package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    private WebDriver driver;
    private By shoppingCartButton= By.cssSelector("#topcartlink");
    private By deleteItemFromCartButton= By.xpath("//tbody/tr[2]/td[7]/button[1]");
    private By checkOutForTerms= By.id("termsofservice");
    private By checkOutButton = By.xpath("//button[@id='checkout']");

    public ShoppingCartPage(WebDriver driver){
        this.driver= driver;
    }
    public ShoppingCartPage clickShoppingCartbutton(){
        driver.findElement(shoppingCartButton).click();
        return new ShoppingCartPage(driver);
    }
    public ShoppingCartPage clickAgreeForTerms(){
        driver.findElement(checkOutForTerms).click();
        return new ShoppingCartPage(driver);
    }
    public ShoppingCartPage clickDeleteItem(){
        driver.findElement(deleteItemFromCartButton).click();
        return new ShoppingCartPage(driver);
    }

    public OpcBillingPage clickCheckOutButtton(){
        driver.findElement(checkOutButton).click();
        return new OpcBillingPage(driver);
    }
}
