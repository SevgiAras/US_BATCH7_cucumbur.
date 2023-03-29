package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@SmokeTest",//runs the scenario that have this tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"}
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {


}
