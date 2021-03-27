package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Cucumber Features/HomePageLichess.feature", glue= {"StepDefinitions/PlayButtonStepDefinitions"},
monochrome=true,
plugin = { "pretty", "html:HtmlReports/HtmlReport"}
)

public class PlayButtonRunner {

}
