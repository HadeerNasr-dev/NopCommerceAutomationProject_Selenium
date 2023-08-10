package notebook;

import ITI.NoteBooksPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NoteBookTests extends BaseTests {
    @Test
    public void successfulNoteBookAddToCart(){
        var noteBook= homepage.clickComputers().clickNoteBooksbutton();
        //NoteBooksPage noteBook= new NoteBooksPage(driver);
        noteBook.clickAddToCart();
        assertEquals("Alert text is not correct","The product has been added to your shopping cart",noteBook.getAlertText()
                );
        noteBook.clickDeleteTheMessage();
    }

}
