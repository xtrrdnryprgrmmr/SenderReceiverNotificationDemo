package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Feature"},glue={"Test"},tags = {"@Mail"},plugin = {"pretty",
        "html:./reports/cucumber-reports/cucumber-html/index.html"})

public class NotificationRunner {
}
