package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class OpcBillingPage {
    private WebDriver driver;
    private By BillingAddress= By.cssSelector("li[id='opc-billing'] div[class='step-title']");
    private By dropDownCountry= By.id("BillingNewAddress_CountryId");
    private By cityField= By.id("BillingNewAddress_City");
    private By address1Field= By.id("BillingNewAddress_Address1");
    private By zipCodeField= By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumberField= By.id("BillingNewAddress_PhoneNumber");
    private By continueButton= By.cssSelector("button[onclick='Billing.save()']");
    private By continueButton2= By.cssSelector(".button-1.shipping-method-next-step-button");
    private By continueButton3= By.cssSelector("button[class='button-1 payment-method-next-step-button']");
    private By continueButton4= By.cssSelector(".button-1.payment-info-next-step-button");
    private By continueButton5= By.cssSelector(".button-1.confirm-order-next-step-button");
    private By lastContinueButton= By.cssSelector(".button-1.order-completed-continue-button");
    public OpcBillingPage(WebDriver driver){
        this.driver= driver;
    }

    public void clickBillingAddress(){
        driver.findElement(BillingAddress).click();
    }
    public void selectFromDropDownCountry(String option){
        findDropDownCountry().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement>selectedElements= findDropDownCountry().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownCountry(){
        return new Select(driver.findElement(dropDownCountry));
    }
    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }
    public void setAddress1Field(String address) {
        driver.findElement(address1Field).sendKeys(address);
    }
    public void setZipCodeField(String zipCode){
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }
    public void setPhoneNumberField(String phoneNumber){
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton2));
    }
    public void clickContinueButton2(){
        driver.findElement(continueButton2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton3));
    }
    public void clickContinueButton3(){
        driver.findElement(continueButton3).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton4));
    }
    public void clickContinueButton4(){
        driver.findElement(continueButton4).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton5));
    }
    public void clickContinueButton5(){
        driver.findElement(continueButton5).click();
    }
    public HomePage clicklastContinueButtton(){
        driver.findElement(lastContinueButton).click();
        return new HomePage(driver);
    }
}
