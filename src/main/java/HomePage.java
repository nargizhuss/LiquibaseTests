import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions{


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

public void clickOnSignInButton(){
    driver.findElements(Locators.BUTTON_SIGN_IN).get(0).click();
}

public void completeLoginForm(String username, String password){
    ajaxClick(Locators.CONTAINER);
    Reports.log("Type username: " + username);
    ajaxSendKeys(Locators.TEXT_FIELD_USERNAME, 1, username);
    Reports.log("Type password: " + password);
    driver.findElements(Locators.TEXT_FIELD_PASSWORD).get(1).sendKeys(password);
    Reports.log("Click on Submit button");
    driver.findElements(Locators.BUTTON_SUBMIT).get(1).click();
}

}