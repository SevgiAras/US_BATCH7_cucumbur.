package StepDefinietion;

import Pages.DialogContent;
import Pages.Navigation;
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
        dc.sendKeysMethod(dc.getFormNameInput(),"ClGR0");
        dc.sendKeysMethod(dc.getFormCodeInput(),"U11");
        dc.clickMethod(dc.getSaveButton());



    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.verifyContainsText(dc.getSuccessMessage(),"successfully");
    }


    @When("Delete country")
    public void deleteCountry() {

        dc.sendKeysMethod(dc.getCountryNAmeSearch(),"CLGR0");
        dc.sendKeysMethod(dc.getCountryCodeSearch(),"U11");
        dc.clickMethod(dc.getCountrySearchBtn());
       dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteCountryBtn());
        dc.clickMethod(dc.getConfirmDeleteCountry());

    }
}
