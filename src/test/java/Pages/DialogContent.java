package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethod;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethod {
    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);

    }
    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),' LOGIN ')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div=['cconsent-bar']//button[@class='consent-give']")
    private WebElement  acceptCookies;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement nameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement codeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchBtn;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteBtn;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private List<WebElement> deleteCountryBtnList;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement citizenshipShortNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    private WebElement citizenshipShortName;


    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getNameSearch() {
        return nameSearch;
    }

    public WebElement getCodeSearch() {
        return codeSearch;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getConfirmDeleteBtn() {
        return confirmDeleteBtn;
    }

    public List<WebElement> getDeleteCountryBtnList() {
        return deleteCountryBtnList;
    }

    public WebElement getCitizenshipShortName() {
        return citizenshipShortName;
    }

    public WebElement getCitizenshipShortNameSearch() {
        return citizenshipShortNameSearch;
    }
}
