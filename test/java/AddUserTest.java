import Pages.AdminPage;
import Pages.Dashboard;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.time.Duration;


public class AddUserTest extends BaseTest {

    LoginPage loginPage;
    Dashboard dashboard;
    AdminPage adminPage;


    @Test
    public void userCanLoginSuccessfully(){
        loginPage=new LoginPage(driver);
        dashboard=new Dashboard(driver);
        loginPage.userLogin("Admin","admin123");
        dashboard.openAdminPage();
    }

    @Test
    public void userCanReadTheRecordedNumber(){
        adminPage=new AdminPage(driver);
        adminPage.numberOfRecordedFound();
    }


    @Test
    public void adminCanAddedNewUser(){

        adminPage=new AdminPage(driver);
        adminPage.clickAddButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        adminPage.selectUserRole("ESS");
        adminPage.enterEmployeeName("Test  Automation");
        adminPage.selectStatus("Enabled");
        adminPage.enterUsername("tester");
        adminPage.enterPassword("Test1234");
        adminPage.confirmPassword("Test1234");
        adminPage.clickSave();
    }



}
