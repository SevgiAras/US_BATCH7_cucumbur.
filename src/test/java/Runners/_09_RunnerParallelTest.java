package Runners;

import Utilities.DriverClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class _09_RunnerParallelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters(value ="browser")
   // public  void beforeClass(String browserName){
    public void beforeClass(@Optional("chrome") String browser){
        DriverClass.setThreadDriverName(browser);
    }



}
