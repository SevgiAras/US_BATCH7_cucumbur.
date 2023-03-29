package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Login.feature"}, // put the feature files we want to run
        glue = {"StepDefinition"} //package for all steps
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
