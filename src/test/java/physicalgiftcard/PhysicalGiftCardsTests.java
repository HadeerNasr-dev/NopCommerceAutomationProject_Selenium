package physicalgiftcard;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PhysicalGiftCardsTests extends BaseTests {
    @Test
    public void addPhysicalGiftCardToCart(){
        var physicalGiftCards= homepage.clickGiftCards().clickAddToCartButton();
        //physicalGiftCards.setRecipientNameField("Kholoud");
        //physicalGiftCards.setYourNameField("Hadeer");
        physicalGiftCards.clickAddToCart();
        assertEquals("Alert text is not correct",
                "Enter valid recipient name",physicalGiftCards.getAlertText()
        );

    }
}
