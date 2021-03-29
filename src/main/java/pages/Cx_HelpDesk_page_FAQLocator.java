package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_FAQLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_FAQLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),'Purchase Related') and @class='title']")
    public WebElement sidebarPurchaseRelatedFaq;

    @FindBy(xpath = "//span[contains(text(),'FAQ's') and @class='title']")
    public WebElement sidebarFaqs;

    @FindBy(xpath = "//h1[contains(text(),'FAQs')]")
    public WebElement titleFaq;

    @FindBy(xpath = "//span[contains(text(),'Purchase Related') and @class='title']")
    public WebElement titlePurchaseRelated;

//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;

    /**
     * TESTCASE METHOD: verifyFAQsDetails
     */
    public void verifyFAQsDetails(){
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebarFaqs));
            HighlightElement.highlightElement(sidebarFaqs);
            sidebarFaqs.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(sidebarPurchaseRelatedFaq);
            genericUtil.clickWithPause(sidebarPurchaseRelatedFaq, 1000);

            HighlightElement.highlightElement(titleFaq);
            genericUtil.clickWithPause(titleFaq, 1000);


        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
