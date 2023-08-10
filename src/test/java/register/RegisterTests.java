package register;

import ITI.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;
public class RegisterTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var registerPage=homepage.clickRegister();
        registerPage.setFirstName("Hadeer");
        registerPage.setLastName("Nasr");

        registerPage.setEmail("hadeernasr62000@gamil.com");
        registerPage.setPassword("nopcommerce@2");
        registerPage.setConfirmPassword("nopcommerce@2");
        HomePage homepage = registerPage.clickRegisterButton();


    }
}
