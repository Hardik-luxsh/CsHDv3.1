package pages;

import TestUtil.*;
import base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class Cx_HelpDesk_page_ConfigSettingLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_ConfigSettingLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 40);
    }

    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement titleHomePage;

    @FindBy(xpath = "//span[text()='Configuration Settings ']")
    public WebElement sidebar_ConfigSettings;

    @FindBy(xpath = "//h1[text()='Configuration Settings ']")
    public WebElement ConfigSettingsHeaderTitle;

    @FindBy(xpath = "//h1[text()='Configuration Settings ']/..//span[text()='Dashboard']")
    public WebElement Dashboard_Title;

    @FindBy(xpath = "//h1[text()='Configuration Settings ']/..//span[text()='Dashboard']//..//..//label[contains(text(),'Select All')]")
    public WebElement Dashboard_SelectAll;

    @FindBy(xpath ="//a[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath ="//a[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath ="//h3[text()='Do You Wish To Apply Selected Changes? If yes you have to login back for reflact changes!']")
    public WebElement alertMessage;

    @FindBy(xpath ="//h3[text()='Do You Wish To Apply Selected Changes? If yes you have to login back for reflact changes!']/../..//button[contains(text(),'Yes')]")
    public WebElement optionYes;

    @FindBy(xpath ="//h3[text()='Do You Wish To Apply Selected Changes? If yes you have to login back for reflact changes!']/../..//button[contains(text(),'No')]")
    public WebElement optionNo;

    @FindBy(xpath ="//h3[contains(text(),' Changed Applied Successfully!')]")
    public WebElement successMsg;

    @FindBy(xpath ="//h3[contains(text(),' Changed Applied Successfully!')]/../..//button[contains(text(),'Ok')]")
    public WebElement Okbutton;

    /**
     * TESTCASE METHOD: VERIFY CONFIG SETTINGS
     */
    public void verifyConfigSettings() {
        genericUtil = new GenericUtil();
        try {
//            wait.until(ExpectedConditions.visibilityOf(sidebar_ConfigSettings));
            HighlightElement.highlightElement(sidebar_ConfigSettings);
            sidebar_ConfigSettings.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(ConfigSettingsHeaderTitle);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(Dashboard_Title);
            genericUtil.clickWithPause(Dashboard_Title,1000);

            HighlightElement.highlightElement(Dashboard_SelectAll);
            genericUtil.clickWithPause(Dashboard_SelectAll,1000);

            HighlightElement.highlightElement(saveButton);
            genericUtil.clickWithPause(saveButton,1000);

            HighlightElement.highlightElement(alertMessage);
            genericUtil.clickWithPause(alertMessage,1000);

            HighlightElement.highlightElement(optionYes);
            genericUtil.clickWithPause(optionYes,1000);

            HighlightElement.highlightElement(successMsg);
            genericUtil.clickWithPause(successMsg,1000);

            HighlightElement.highlightElement(Okbutton);
            genericUtil.clickWithPause(Okbutton,1000);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
