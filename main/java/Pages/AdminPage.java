package Pages;

import Utilities.ActionsElement;
import Utilities.Waite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    WebDriver driver;
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator
    private final By recordNUmber = By.xpath("//span[contains(normalize-space(),'Records Found')]");
    private final By addButton= By.xpath("button[type=\"button\"][class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

    private final By userRoleDropdown = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container.--collapse > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button");

    private final By employeeName = By.xpath("//input[@placeholder='Type for hints...']");

    private final By statusDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");

    private final By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    private final By password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");

    private final By confirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    private final By saveButton = By.xpath("//button[normalize-space()='Save']");

    //Action

    public void numberOfRecordedFound(){

        Waite.waitForElementClickable(driver,recordNUmber);
        String recordedNumber= driver.findElement(recordNUmber).getText();
        System.out.println(recordedNumber);

    }

    public void clickAddButton() {
        Waite.waitForElementClickable(driver, addButton);
        driver.findElement(addButton).click();
    }

    public void selectUserRole(String role) {
        Waite.waitForElementClickable(driver, userRoleDropdown);
        driver.findElement(userRoleDropdown).click();

        By roleOption = By.xpath("//div[normalize-space()='" + role + "']");

        Waite.waitForElementClickable(driver, roleOption);
        driver.findElement(roleOption).click();
    }

    public void enterEmployeeName(String Name) {

        ActionsElement.clickOnElement(driver,employeeName);
        ActionsElement.sendData(driver,employeeName,Name);

    }

    public void selectStatus(String status) {

        driver.findElement(statusDropdown).click();

        driver.findElement(
                        By.xpath("//div[normalize-space()='" + status + "']"))
                .click();
    }

    public void enterUsername(String user) {

        ActionsElement.sendData(driver,username,user);
    }

    public void enterPassword(String pass) {

        ActionsElement.sendData(driver,password,pass);
    }

    public void confirmPassword(String pass) {

        ActionsElement.sendData(driver,confirmPassword,pass);
    }

    public void clickSave() {

        Waite.waitForElementClickable(driver, saveButton);
        ActionsElement.clickOnElement(driver,saveButton);
    }



}
