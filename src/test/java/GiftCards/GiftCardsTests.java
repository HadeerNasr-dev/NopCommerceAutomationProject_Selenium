package GiftCards;

import ITI.GiftCardsPage;
import ITI.PhysicalGiftCardPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class GiftCardsTests extends BaseTests {
    @Test
    public void testDifferentCards(){
        var giftCardsPage= homepage.clickGiftCards();
        PhysicalGiftCardPage physicalGiftCardPage = giftCardsPage.clickAddToCartButton();
    }
}
