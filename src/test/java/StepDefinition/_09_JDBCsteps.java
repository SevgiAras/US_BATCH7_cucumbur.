package StepDefinition;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.DBUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _09_JDBCsteps {

    DialogContent dc =new DialogContent();
    Navigation nv =new Navigation();

    @Given("Navigate to States page")
    public void navigate_to_states_page() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getStatesBtn());


    }
    ArrayList<ArrayList<String>> dblist;

    @When("Send the query {string}")
    public void send_the_query(String query) {
    dblist = DBUtilities.getData(query);
        System.out.println(dblist);

    }
    @Then("Check if they match wit UI")
    public void check_if_they_match_wit_ui() {
        List<WebElement> uilist =dc.getStatesList();
        for (int i=1; i<= uilist.size(); i++){
            Assert.assertEquals(dblist.get(i).get(1),uilist.get(i).getText());

        }

    }

}
