import Pages.Dashboard;
import Pages.LoginPage;
import org.testng.annotations.Test;


public class AddUserTest extends BaseTest {

    LoginPage loginPage;
    Dashboard dashboard;

    @Test
    public void userCanLoginSuccessfully(){
        loginPage=new LoginPage(driver);
        dashboard=new Dashboard(driver);
        loginPage.userLogin("Admin","admin123");
        dashboard.openAdminPage();
    }



}
