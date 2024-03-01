package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import java.lang.System;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "src/main/java/stepDefinitions", // Package where your step definitions are located
        tags = "",
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for test reporting
)
public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Welcome");
        // This class will not contain any code. It just acts as a placeholder for running Cucumber tests.
    }
}

