package pages;

import TestUtil.GenericUtil;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_FAQ_PurchaseRelatedLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    
    public Cx_HelpDesk_page_FAQ_PurchaseRelatedLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }
}
