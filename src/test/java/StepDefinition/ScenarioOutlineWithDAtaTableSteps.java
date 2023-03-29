package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ScenarioOutlineWithDAtaTableSteps {

    @Given("Step One")
    public void stepOne(DataTable dataTable) {
        List<List<String>> dataList =dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));


    }

    @When("Step two")
    public void stepTwo() {
        System.out.println("Step 2");
    }

    @Then("Step three")
    public void stepThree(DataTable dataTable) {
        List<List<String>> dataList =dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(1).get(1));

    }

    @Then("Step four")
    public void stepFour() {
        System.out.println("Step 4");
    }
}
