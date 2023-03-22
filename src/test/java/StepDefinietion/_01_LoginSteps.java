package StepDefinietion;

import Pages.DialogContent;
import Utilities.BasicDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dialogContent =new DialogContent();
    WebDriverWait wait =new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();

    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginUsername()));

        dialogContent.getLoginUsername().sendKeys("turkeyts");
     dialogContent.getLoginPassword().sendKeys("TechnoStudy123");
    }
    @When("Click on login Button")
    public void click_on_login_button() {
    dialogContent.getLoginButton().click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
}
