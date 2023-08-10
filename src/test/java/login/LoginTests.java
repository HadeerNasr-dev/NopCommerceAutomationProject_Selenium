package login;

import ITI.HomePage;
import ITI.LoginPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfuLogin(){
        LoginPage loginpage= homepage.clickbuttonLogin();
        loginpage.setEmail("hdyr777@gmail.com");
        loginpage.setPassword("nopCommerce@2");
        HomePage homepage=loginpage.clickLoginButton();
    }
}
