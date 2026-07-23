package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waite {

    private Waite(){}
    public static WebElement waitForElementClickable(WebDriver driver,By locator){
        return new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(locator));
    }
}
