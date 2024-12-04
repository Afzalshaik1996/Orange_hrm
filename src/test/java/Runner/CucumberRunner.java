package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/Features"},
        glue = {"StepDefs"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
//        dryRun = true
)

public class CucumberRunner extends AbstractTestNGCucumberTests{
}
