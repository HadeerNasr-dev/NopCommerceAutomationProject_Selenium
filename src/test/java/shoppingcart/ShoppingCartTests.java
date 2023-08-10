package shoppingcart;

import ITI.HomePage;
import ITI.LoginPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTests extends BaseTests {
    @Test(priority = 1)
    public void userRegister() {
        var registerPage = homepage.clickRegister();
        registerPage.setFirstName("Hadeer");
        registerPage.setLastName("Nasr");
        registerPage.setEmail("hadeernasr9@gmail.com");
        registerPage.setPassword("nopcommerce@2");
        registerPage.setConfirmPassword("nopcommerce@2");
        HomePage homepage = registerPage.clickRegisterButton();
    }
    @Test(priority = 2)
    public void userLogin(){
        LoginPage loginpage= homepage.clickbuttonLogin();
        loginpage.setEmail("hadeernasr9@gmail.com");
        loginpage.setPassword("nopcommerce@2");
        HomePage homepage=loginpage.clickLoginButton();
    }
    @Test(priority = 3)
    public void userNoteBookAddToCart(){
        var noteBook= homepage.clickComputers().clickNoteBooksbutton();
        noteBook.clickAddToCart();
        assertEquals("Alert text is not correct","The product has been added to your shopping cart",noteBook.getAlertText());
        noteBook.clickDeleteTheMessage();
    }
    @Test(priority = 4)
    public void addingToShoppingCart(){
        var shoppingCartpage= homepage.clickShoppingCartButton();
        shoppingCartpage.clickShoppingCartbutton();
        //shoppingCartpage.clickDeleteItem();
        shoppingCartpage.clickAgreeForTerms();

    }
    @Test(priority = 5)
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

    }

}
