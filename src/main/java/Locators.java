import org.openqa.selenium.By;

public class Locators {

    // Login page
    public static final By BUTTON_SIGN_IN = By.xpath("//button//span[contains(text(), 'Sign In ')]");
    public static final By CONTAINER = By.xpath("//div[@class='container']");
    public static final By TEXT_FIELD_USERNAME = By.xpath("//div[@class='modal-body']//input[@id='signInFormUsername']");
    public static final By TEXT_FIELD_PASSWORD = By.xpath("//input[@id='signInFormPassword']");
    public static final By BUTTON_SUBMIT = By.xpath("//input[@name='signInSubmitButton']");

    public static final By BUTTON_NEXT_API_KEY = By.xpath("//button[@type='submit']");
    public static final By BUTTON_NEXT_CLI = By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit']");
    public static final By BUTTON_NEXT_CHANGE_LOG = By.xpath("//mat-step-header[@id='cdk-step-label-0-2']");
    public static final By BUTTON_CLOSE = By.xpath("//span[text()='Close']");

    public static final By ACCOUNT_TREE_OPTION = By.xpath("//div[@class='sidenav__context mat-elevation-z3']//div[@class='mat-ripple sidenav__context__item']//mat-icon[text()='account_tree']");
    public static final By DEFAULT_PROJECT = By.xpath("//div[@class='projects-tree__item__label__text']");
    public static final By OPERATIONS_OPTION = By.xpath("//div[text()='Operations']");
    public static final By FILTER_RESULTS = By.xpath("//mat-select[@placeholder='Result'][@role='listbox']");
    public static final By FILTER_NO_OPERATIONS = By.xpath("//mat-panel-title[contains(text(), ' No Operations to display')]");
    public static final By OPERATIONS_MESSAGE = By.xpath("//div[contains(@class, 'mat-expansion-panel-body')]");
    public static final By PASS_OPTION = By.xpath("//mat-option[contains(@id, 'mat-option')]//span[contains(text(), 'Pass')]");
    public static final By SETTINGS_OPTION = By.xpath("//div[@class='sidenav__context mat-elevation-z3']//div[@class='mat-ripple sidenav__context__item']//mat-icon[text()='settings']");
    public static final By API_KEYS_TAB = By.xpath("//div[text()='API Keys']");

    //USer info

    public static final By USER_INFO_TAB = By.xpath("//div[text()='User Info']");
    public static final By TEXT_FIELD_FIRST_NAME_USER_INFO = By.xpath("//mat-label[text()='First Name']//ancestor::mat-form-field[contains(@class,'mat-form-field edit-user__item')]//input");
    public static final By TEXT_FIELD_LAST_NAME_USER_INFO = By.xpath("//mat-label[text()='Last Name']//ancestor::mat-form-field[contains(@class,'mat-form-field edit-user__item')]//input");
    public static final By TEXT_FIELD_URL_USER_INFO = By.xpath("//mat-label[text()='URL']//ancestor::mat-form-field[contains(@class,'mat-form-field edit-user__item')]//input");
    public static final By BUTTON_UPDATE_PROFILE = By.xpath("//span[text()='Update Profile']");








}
