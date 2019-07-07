package bootcamping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExpediaTest {

    WebDriver demo;

    @Test
    public void testing() throws Exception {

        demo=ExpediaFactory.hdBrowser("chrome", "https://www.expedia.com/");

        ExpediaPages page= PageFactory.initElements(demo, ExpediaPages.class);

        page.formFill();
        page.newPage();
        page.booking();
        page.pymtPage();

    }

}

