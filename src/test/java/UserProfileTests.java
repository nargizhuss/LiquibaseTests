import org.testng.Assert;
import org.testng.annotations.Test;

public class UserProfileTests extends BaseUI {

    String expectedFirstName = Data.firstName + userInfo.generateNewWord(7);
    String expectedLastName = Data.lastName + userInfo.generateNewWord(7);
    String expectedUrl = Data.url + userInfo.generateNewWord(7);

    String actualFirstName;
    String actualLastName;
    String actualUrl;

    @Test
    public void testUserInfo() {
        homePage.clickOnSignInButton();
        homePage.completeLoginForm(Data.username, Data.password);
        mainPage.completeApiKeyForm();
        mainPage.clickOnSettingsOption();
        mainPage.clickOnUserInfo();
        userInfo.completeUserInfo(expectedFirstName, expectedLastName, expectedUrl);
        mainPage.clickOnApiKeys();
        mainPage.clickOnUserInfo();
        actualFirstName = userInfo.getFirstNameValue();
        actualLastName = userInfo.getLastNameValue();
        actualUrl = userInfo.getUrlValue();
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedUrl, actualUrl);


    }



    @Test
    public void testProjects() {
        homePage.clickOnSignInButton();
        homePage.completeLoginForm(Data.username, Data.password);
        mainPage.completeApiKeyForm();
        mainPage.clickOnProjectOption();
        mainPage.clickDefaultProject();
        mainPage.clickOperationsOption();
        operations.selectRequiredFilters();
        Assert.assertTrue(driver.findElement(Locators.OPERATIONS_MESSAGE).isDisplayed());

    }

}
