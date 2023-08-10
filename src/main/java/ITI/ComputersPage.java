package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputersPage {
    private WebDriver driver;
    private By noteBooksOption= By.cssSelector("img[title='Show products in category Notebooks']");
    public ComputersPage(WebDriver driver){
        this.driver= driver;
    }

    public NoteBooksPage clickNoteBooksbutton(){
        driver.findElement(noteBooksOption).click();
        return new NoteBooksPage(driver);
    }
}
