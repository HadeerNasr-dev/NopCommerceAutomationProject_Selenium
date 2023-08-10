package computers;

import ITI.NoteBooksPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class ComputersTests extends BaseTests {
    @Test
    public void testComputersCategories(){
     var computerpage= homepage.clickComputers();
        NoteBooksPage notebookpage = computerpage.clickNoteBooksbutton();
    }
}
