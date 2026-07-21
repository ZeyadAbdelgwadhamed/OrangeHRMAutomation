import Pages.LoginPage;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {


    @Test
    public void userCanLoginSuccessfully(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.userLogin("Admin","admin123");
    }
}
