package StepDefinition;

import Pages.DialogContent;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class _07_CreateCitizenshipApachePOISteps {
    DialogContent dc =new DialogContent();

    @Then("Create a citizenship by Apache POI")
        public void createACitizenshipByApachePOI() throws InterruptedException {
        dc.clickMethod(dc.getAddButton());

        ArrayList <ArrayList<String>> citizenShipData =
                ExcelUtilities.getDataFromExcel("src/test/java/ApachePOI/Resources/Book1.xlsx", "CitizenShip",2);
        for (int i=0; i< citizenShipData.size(); i++) {

            dc.clickMethod(dc.getAddButton());
           //Thread.sleep(2000);
            dc.sendKeysMethod(dc.getFormNameInput(),citizenShipData.get(i).get(0));
           // Thread.sleep(2000);
            dc.sendKeysMethod(dc.getCitizenshipShortName(),citizenShipData.get(i).get(1));
            dc.clickMethod(dc.getSaveButton());
            dc.verifyContainsText(dc.getSuccessMessage(), "success");
            dc.wait.until(ExpectedConditions.visibilityOf(dc.getSuccessMessage()));

        }
    }
}
