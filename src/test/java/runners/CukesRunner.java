package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.text",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },

        features = "src/test/resources/features",
        glue= "step_definitions",
        dryRun =false,
        tags = "@PER10-261"


)
public class CukesRunner {

}
