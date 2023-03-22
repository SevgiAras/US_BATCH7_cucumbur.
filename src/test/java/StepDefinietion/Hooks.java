package StepDefinietion;

import Utilities.BasicDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario() {
        System.out.println("Scenario has started");
    }

    @After // This method runs after every scenario
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario has ended");
//        if (scenario.isFailed()) {
//
//            final byte[] byteImage = ((TakesScreenshot) BasicDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(byteImage, "image/png", scenario.getName());
        }

    }
//
//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Step has started");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("Step has ended");
//    }


