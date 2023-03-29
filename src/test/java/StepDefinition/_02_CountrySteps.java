package StepDefinition;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_CountrySteps {

    DialogContent dc=new DialogContent();
    Navigation nv =new Navigation();



    @Then("Navigate to Country page")
    public void navigate_to_country_page() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());

    }
    @When("Create a new country")
    public void create_a_new_country() {
        dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"S2");
        dc.sendKeysMethod(dc.getFormCodeInput(),"11");
        dc.clickMethod(dc.getSaveButton());



    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.verifyContainsText(dc.getSuccessMessage(),"successfully");
    }


    @When("Delete country")
    public void deleteCountry() {

        dc.sendKeysMethod(dc.getNameSearch(),"S2");
        dc.sendKeysMethod(dc.getCodeSearch(),"11");
        dc.clickMethod(dc.getSearchBtn());
       dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteBtn());
        dc.clickMethod(dc.getConfirmDeleteBtn());

    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String countryName, String countryCode) {
    dc.sendKeysMethod(dc.getFormNameInput(),countryName);
    dc.sendKeysMethod(dc.getFormCodeInput(),countryCode);


    }

    @And("Click on save button")
    public void clickOnSaveButton() {
   dc.clickMethod(dc.getSaveButton());

    }
}
