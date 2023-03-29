package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.checkerframework.checker.units.qual.C;

@CucumberOptions(
        tags = "@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"}
)
public class _05_RunnerWithMultipleTags extends AbstractTestNGCucumberTests {
}
