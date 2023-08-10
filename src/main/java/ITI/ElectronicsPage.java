package ITI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage {
    private static WebDriver driver;
    private By cellPhonesOption= By.cssSelector("img[title='Show products in category Cell phones']");
    public ElectronicsPage(WebDriver driver) {
        this.driver= driver;
    }
    public CellPhonesPage clickCellPhonesButton(){
        driver.findElement(cellPhonesOption).click();
        return new CellPhonesPage(driver);
    }

}
