package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepDefination"},plugin = {"pretty","html:Reports/CucumberReports.html",
		"json:Reports/CucumberJSONReport.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun=true)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
