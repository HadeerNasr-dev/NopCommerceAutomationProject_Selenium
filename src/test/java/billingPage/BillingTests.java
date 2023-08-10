package billingPage;

import ITI.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

public class BillingTests extends BaseTests {
    @Test
    public void testBilling(){
        var billingpage= homepage.clickShoppingCartButton().clickCheckOutButtton();
        billingpage.clickBillingAddress();
        billingpage.selectFromDropDownCountry("Egypt");
        billingpage.setCityField("Samanood");
        billingpage.setAddress1Field("Garphyia");
        billingpage.setZipCodeField("11511");
        billingpage.setPhoneNumberField("01207233288");
        billingpage.clickContinueButton();
        billingpage.clickContinueButton2();
        billingpage.clickContinueButton3();
        billingpage.clickContinueButton4();
        billingpage.clickContinueButton5();
        HomePage homepage= billingpage.clicklastContinueButtton();
    }
}
