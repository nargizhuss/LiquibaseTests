import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;


public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }


    public void ajaxClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void ajaxClick(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }


    public void ajaxSendKeys(By locator,int index, String text){
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','"+ text +"')",driver.findElements(locator).get(index));

    }

    public static String generateNewWord(int length) {

        return  RandomStringUtils.random(length, "abcnjdfllgl");
    }
    }













