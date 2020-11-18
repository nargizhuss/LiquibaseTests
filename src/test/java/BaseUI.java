import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    MainPage mainPage;
    UserInfo userInfo;
    Operations operations;


    @BeforeMethod
    public void setUp(Method method) {
        Reports.start(method.getDeclaringClass().getName() + " : " + method.getName());
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        homePage = new HomePage(driver, wait);
        mainPage = new MainPage(driver, wait);
        userInfo = new UserInfo(driver, wait);
        operations = new Operations(driver, wait);
        driver.get("chrome://settings/clearBrowserData");
        driver.manage().window().maximize();
        driver.get(Data.MAIN_URL);
    }


    @AfterMethod
    public void tearDown(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
       driver.quit();
    }
    }


