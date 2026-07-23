package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.ActionsElement.clickOnElement;

public class Dashboard {

    WebDriver driver;
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    //Locator

    public final By adminButton = By.xpath("//span[text()='Admin']");

    //Action

    public void openAdminPage(){

        clickOnElement(driver,adminButton);

    }



}
