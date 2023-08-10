package cellphones;

import ITI.CellPhonesPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CellPhonesTests extends BaseTests {
    @Test
    public void successfulAddCellPhoneToCart(){
        var cellphonepage= homepage.clickElectronics().clickCellPhonesButton();
        cellphonepage.clickAddToCartbutton();
        assertEquals("Alert text is not correct","The product has been added to your shopping cart",cellphonepage.getAlertText());
    }
}
