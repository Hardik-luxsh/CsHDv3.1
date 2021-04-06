package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_FAQs_WebRelatedLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_FAQs_WebRelatedLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),\"FAQ's\") and @class='title']")
    public WebElement sidebarFaqs;

    @FindBy(xpath = "//h1[contains(text(),'FAQs')]")
    public WebElement titleFaq;

    /********************** Website Related **************************/

    @FindBy(xpath = "//span[contains(text(),'Website Related') and @class='title']")
    public WebElement sidebarWebsiteRelatedFaq;

    @FindBy(xpath = "//span[contains(text(),'Website Related') and @class='title']")
    public WebElement titleWebsiteRelated;

    @FindBy(xpath = "//span[@class=\"caption-subject font-dark bold uppercase\"]")
    public WebElement sectionHeadingWebsiteRelated;

    @FindBy(xpath = "//p[contains(text(),' How can I add the products to my basket?')]")
    public WebElement WRQueFAQ1;

    @FindBy(xpath = "//p[contains(text(),' How can I add the products to my basket?')]//..//ul")
    public WebElement WRAnsFAQ1;

    @FindBy(xpath = "//p[contains(text(),' How do I edit orders in my order history pad?')]")
    public WebElement WRQueFAQ2;

    @FindBy(xpath = "//p[contains(text(),' How do I edit orders in my order history pad?')]//..//ul")
    public WebElement WRAnsFAQ2;

    @FindBy(xpath = "//p[contains(text(),'How can I add products to favourites?')]")
    public WebElement WRQueFAQ3;

    @FindBy(xpath = "//p[contains(text(),'How can I add products to favourites?')]//..//ul")
    public WebElement WRAnsFAQ3;

    @FindBy(xpath = "//p[contains(text(),' How do I download my statements?')]")
    public WebElement WRQueFAQ4;

    @FindBy(xpath = "//p[contains(text(),' How do I download my statements?')]//..//ul")
    public WebElement WRAnsFAQ4;

    @FindBy(xpath = "//p[contains(text(),' How do I add products to my order pad from the offers list?')]")
    public WebElement WRQueFAQ5;

    @FindBy(xpath = "//p[contains(text(),' How do I add products to my order pad from the offers list?')]//..//ul")
    public WebElement WRAnsFAQ5;

    /**
     * TESTCASE METHOD: verifyFAQsPRDetails
     */
    public void verifyFAQsWRDetails(){
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebarFaqs));
            HighlightElement.highlightElement(sidebarFaqs);
            sidebarFaqs.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(sidebarWebsiteRelatedFaq);
            genericUtil.clickWithPause(sidebarWebsiteRelatedFaq, 1000);

            HighlightElement.highlightElement(titleFaq);
            genericUtil.clickWithPause(titleFaq, 1000);

            HighlightElement.highlightElement(titleWebsiteRelated);
            genericUtil.clickWithPause(titleWebsiteRelated, 1000);

            HighlightElement.highlightElement(sectionHeadingWebsiteRelated);
            genericUtil.clickWithPause(sectionHeadingWebsiteRelated, 1000);

            HighlightElement.highlightElement(WRQueFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRAnsFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRQueFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRAnsFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRQueFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRAnsFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRQueFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRAnsFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRQueFAQ5);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(WRAnsFAQ5);
            genericUtil.pause(1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
