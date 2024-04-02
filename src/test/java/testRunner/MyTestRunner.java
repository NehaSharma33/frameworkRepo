package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}, // Path to the directory containing feature files
        glue = {"stepDefinition","ApplicationHooks"}, // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for generating reports
)
public class MyTestRunner {

}
