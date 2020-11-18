import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Operations extends BaseActions {


    public Operations(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectRequiredFilters() {
        Reports.log("Click on filter Results");
        driver.findElement(Locators.FILTER_RESULTS).click();
        Reports.log("Click on Pass option");
        driver.findElement(Locators.PASS_OPTION).click();
        Reports.log("Click on No operations");
        ajaxClick(Locators.FILTER_NO_OPERATIONS);
    }
}