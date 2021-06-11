package testcase;

import TestUtil.*;
import base.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;

public class Cx_HelpDesk_DashboardPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_DashboardLocator objDashboard;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void dailyReport(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.dailyReport("01-10-2020","10-06-2021");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void listOfEscalatedTickets(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.listOfEscalatedTickets();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void channelsOfDistribution(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.channelsOfDistribution("01-10-2020","10-06-2021");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ticketAssignedToMe(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.ticketAssignedToMe();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void ticketPerformance(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.ticketPerformance();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void ticketReopeningRate(){
        try {
            objDashboard = new Cx_HelpDesk_page_DashboardLocator(driver);
            objDashboard.ticketReopeningRate();
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
