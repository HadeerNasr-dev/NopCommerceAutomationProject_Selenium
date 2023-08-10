package electronics;

import ITI.CellPhonesPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class ElectronicsTests extends BaseTests {
    @Test
    public void testElectronicsCategories(){
        var electronicspage= homepage.clickElectronics();
        CellPhonesPage cellPhonepage= electronicspage.clickCellPhonesButton();
    }
}
