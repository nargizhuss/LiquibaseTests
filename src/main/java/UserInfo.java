import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserInfo extends BaseActions{


    public UserInfo(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

  public void completeUserInfo(String firstName, String lastName, String url){
      Reports.log("Clear first name");
      driver.findElement(Locators.TEXT_FIELD_FIRST_NAME_USER_INFO).clear();
      Reports.log("Type first name: " + firstName);
      driver.findElement(Locators.TEXT_FIELD_FIRST_NAME_USER_INFO).sendKeys(firstName);
      Reports.log("Clear last name");
      driver.findElement(Locators.TEXT_FIELD_LAST_NAME_USER_INFO).clear();
      Reports.log("Type last name: " + lastName);
      driver.findElement(Locators.TEXT_FIELD_LAST_NAME_USER_INFO).sendKeys(lastName);
      Reports.log("Clear URL");
      driver.findElement(Locators.TEXT_FIELD_URL_USER_INFO).clear();
      Reports.log("Type URL: " + url);
      driver.findElement(Locators.TEXT_FIELD_URL_USER_INFO).sendKeys(url);
      Reports.log("Click Update button");
      ajaxClick(Locators.BUTTON_UPDATE_PROFILE);
  }


  public String getFirstNameValue(){
      Reports.log("Click First Name text field");
      ajaxClick(Locators.TEXT_FIELD_FIRST_NAME_USER_INFO);
      String actualFirstName = driver.findElement(Locators.TEXT_FIELD_FIRST_NAME_USER_INFO).getAttribute("value");
      Reports.log("Actual first name: " + actualFirstName);
      return actualFirstName;
  }

    public String getLastNameValue(){
        ajaxClick(Locators.TEXT_FIELD_LAST_NAME_USER_INFO);
        String actualLastName =driver.findElement(Locators.TEXT_FIELD_LAST_NAME_USER_INFO).getAttribute("value");
        Reports.log("Actual last name: " + actualLastName);
        return actualLastName;
    }

    public String getUrlValue(){
        ajaxClick(Locators.TEXT_FIELD_URL_USER_INFO);
        String actualUrl = driver.findElement(Locators.TEXT_FIELD_URL_USER_INFO).getAttribute("value");
        Reports.log("Actual URL: " + actualUrl);
        return actualUrl;
    }
}