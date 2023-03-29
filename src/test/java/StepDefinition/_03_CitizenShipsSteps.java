package StepDefinition;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenShipsSteps {

    DialogContent dc=new DialogContent();
    Navigation nv =new Navigation();

    @Given("Navigate to CitizenShips page")
    public void navigateToCitizenShipsPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCitizenShipButton());

    }

    @Then("Enter CitizenShip name as {string} and citizenShip short name as {string}")
    public void enterCitizenShipNameAsAndCitizenShipShortNameAs(String citizenShipName, String citizenShipShortName) {
       // dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),citizenShipName);
        dc.sendKeysMethod(dc.getCitizenshipShortName(),citizenShipShortName);
    }

    @And("search  for citizenShip with name  as {string} and short name as {string}")
    public void searchForCitizenShipWithNameAsAndShortNameAs(String citizenShipNAme, String citizenShipShortName) {
        dc.sendKeysMethod(dc.getNameSearch(),citizenShipNAme);
        dc.sendKeysMethod(dc.getCitizenshipShortName(),citizenShipShortName);
    }

    @And("Delete citizenship")
    public void deleteCitizenship() {
        dc.clickMethod(dc.getSearchBtn());
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteBtn());
        dc.clickMethod(dc.getConfirmDeleteBtn());
    }
}
