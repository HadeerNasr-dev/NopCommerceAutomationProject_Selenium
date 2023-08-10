package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver =driver;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickbuttonLogin() {
        clickLink("Log in");
        return new LoginPage(driver);
    }
    public RegisterPage clickRegister(){
        clickLink("Register");
        return new RegisterPage(driver);
    }
    public ComputersPage clickComputers(){
        clickLink("Computers");
        return new ComputersPage(driver);
    }
    public ElectronicsPage clickElectronics(){
        clickLink("Electronics");
        return new ElectronicsPage(driver);
    }
    public GiftCardsPage clickGiftCards(){
        clickLink("Gift Cards");
        return new GiftCardsPage(driver);
    }
    public ShoppingCartPage clickShoppingCartButton(){
       By topCartLink= By.id("topcartlink");
        return new ShoppingCartPage(driver);
    }
}
