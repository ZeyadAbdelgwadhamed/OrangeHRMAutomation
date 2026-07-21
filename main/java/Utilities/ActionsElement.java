package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Scrolling.scrollToElement;
import static Utilities.Waite.waitForElementClickable;
public class ActionsElement {

    private ActionsElement(){}


    public static void sendData(WebDriver driver, By locator, String text){
        waitForElementClickable(driver,locator);
        scrollToElement(driver,locator);
        driver.findElement(locator).sendKeys(text);
    }


    public static void clickOnElement(WebDriver driver,By locator){
        waitForElementClickable(driver,locator);
        scrollToElement(driver,locator);
        driver.findElement(locator).click();
    }

}
