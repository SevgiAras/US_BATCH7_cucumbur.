package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethod {
    public Navigation() {

        PageFactory.initElements(BasicDriver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "//a [@href='/citizenships/list']")
    private WebElement citizenShipButton;


    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }

    public WebElement getCitizenShipButton() {
        return citizenShipButton;

    }

    public WebElement getFeesButton() {
        return feesButton;
    }
}

