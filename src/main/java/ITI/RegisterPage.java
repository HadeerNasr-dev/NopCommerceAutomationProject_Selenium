package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class RegisterPage {
    private WebDriver driver;
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By confirmPasswordField = By.id("ConfirmPassword");
    private By registerButtonField = By.id("register-button");
    public RegisterPage(WebDriver driver) {
        this.driver= driver;
    }
    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPassword(String confirmpassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmpassword);
    }
    public HomePage clickRegisterButton(){
        driver.findElement(registerButtonField).click();
        return new HomePage(driver);
    }
}
