package StepDefinietion;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.BasicDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _05_FeeFunctionalitySteps {

    DialogContent dc=new DialogContent();
    Navigation nv =new Navigation();
    @Given("Navigate to Fee Page")
    public void navigateToFeePage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getFeesButton());
    }

    @And("Fill the add fee form")
    public void fillTheAddFeeForm(DataTable dataTable) {

        List<String> dataList =dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getFormNameInput(),dataList.get(0));
        dc.sendKeysMethod(dc.getFormCodeInput(),dataList.get(1));
        dc.sendKeysMethod(dc.getIntegrationCodeButton(),dataList.get(2));
        dc.sendKeysMethod(dc.getPriorityInput(),dataList.get(3));
        Actions actions=new Actions(BasicDriver.getDriver());
        Action action =actions.sendKeys(Keys.TAB).build();
        action.perform();



    }

    @Given("Search for the Fee")
    public void searchForTheFee(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.getNameSearch()));
        dc.sendKeysMethod(dc.getNameSearch(),dataList.get(0));
        dc.sendKeysMethod(dc.getCodeSearch(),dataList.get(1));
        dc.sendKeysMethod(dc.getPrioritySearchInput(),dataList.get(2));


    }

    @When("Delete on Fee")
    public void deleteOnFee(DataTable dataTable) {
        List<String>dataList=dataTable.asList(String.class);
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteBtn());
        dc.clickMethod(dc.getConfirmDeleteBtn());
    }
}
