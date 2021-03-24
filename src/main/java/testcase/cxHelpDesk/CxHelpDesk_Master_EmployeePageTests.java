package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import com.sun.org.glassfish.gmbal.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_Master_EmployeeLocator;

import java.io.File;

public class CxHelpDesk_Master_EmployeePageTests extends TestBase {

    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_Master_EmployeeLocator objMasterEmployeeLocator;

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);
//    }

    @Test(priority = 1)
    public void createEmployee(){
        try {
            objMasterEmployeeLocator = new Cx_HelpDesk_page_Master_EmployeeLocator(driver);
            objMasterEmployeeLocator.createEmployee("Employee Test "  + Constants.ContactPersonName ,"EmpTest@test.com",
                    "EmpTest"  + Constants.date.getTime(), "Agent", "EmpTest"  + Constants.date.getTime());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editEmployee(){
        try {
            objMasterEmployeeLocator = new Cx_HelpDesk_page_Master_EmployeeLocator(driver);
            objMasterEmployeeLocator.editEmployee("New Test","UpdatedEmpTest@test.com",
                    "NewEmpTest", "Admin", "NewEmpTest");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteEmployee(){
        try {
            objMasterEmployeeLocator = new Cx_HelpDesk_page_Master_EmployeeLocator(driver);
            objMasterEmployeeLocator.deleteEmployee("UpdatedEmpTest");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @AfterMethod
    public void captureScreenShot(ITestResult result){
        CaptureScreenshot.captureScreenshotForFailedTests(driver,result);
        CaptureScreenshot.captureScreenshotPassedTests(driver,result);
    }

}
