package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		snippets = SnippetType.CAMELCASE,
		tags = "@dropDown",
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		monochrome = true,
		dryRun = false
		)

public class RunnerTest {
	

}
