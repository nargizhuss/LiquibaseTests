import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{


    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void completeApiKeyForm(){
        Reports.log("Click on API key link");
        ajaxClick(Locators.BUTTON_NEXT_API_KEY);
        Reports.log("Click on Next button");
        ajaxClick(Locators.BUTTON_NEXT_CLI);
        Reports.log("Click on Next button");
        ajaxClick(Locators.BUTTON_NEXT_CHANGE_LOG);
        Reports.log("Click on Close button");
        ajaxClick(Locators.BUTTON_CLOSE);

    }

    public void clickOnSettingsOption() {
        Reports.log("Click on Setting options");
        ajaxClick(Locators.SETTINGS_OPTION);
    }

    public void clickOnProjectOption() {
        Reports.log("Click on Project option");
        ajaxClick(Locators.ACCOUNT_TREE_OPTION);
    }


    public void clickDefaultProject() {
        Reports.log("Click on Project option");
        ajaxClick(Locators.DEFAULT_PROJECT);
    }


    public void clickOperationsOption() {
        Reports.log("Click on Operations option");
        ajaxClick(Locators.OPERATIONS_OPTION);
    }
    public void clickOnUserInfo(){
        Reports.log("Click on Info tab");
        driver.findElement(Locators.USER_INFO_TAB).click();
    }

    public void clickOnApiKeys(){
        Reports.log("Click on API keys tab");
        ajaxClick(Locators.API_KEYS_TAB);
    }
}