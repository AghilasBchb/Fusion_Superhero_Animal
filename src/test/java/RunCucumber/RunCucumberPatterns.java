package RunCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/patternsFeatures",glue="patternsStepDefinitions", tags = "@tag1", monochrome = true)


public class RunCucumberPatterns {
}
