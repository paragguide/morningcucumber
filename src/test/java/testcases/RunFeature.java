package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "src\\test\\resources\\feature\\document.feature",
		glue = {"testcases"},
		tags = "(@login and @nopcommerce) or @search",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports/report.html"
				},
		publish = true
		
		
		)

public class RunFeature 
{
// empty
}
