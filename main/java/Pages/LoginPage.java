package Pages;

import Utilities.Waite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.ActionsElement.clickOnElement;
import static Utilities.ActionsElement.sendData;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By username = By.cssSelector("input[name= 'username']");

    private final By password = By.cssSelector("input[type='password']");

    private final By loginButton =
            By.cssSelector("button[type='submit']");

    // Action

    public void userLogin(String enterUsername,String enterPassword){
        Waite.waitForElementClickable(driver,username);
        sendData(driver,username,enterUsername);
        sendData(driver,password,enterPassword);
        clickOnElement(driver,loginButton);

    }



}
