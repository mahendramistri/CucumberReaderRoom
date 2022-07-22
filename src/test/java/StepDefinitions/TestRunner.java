package StepDefinitions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;  // add manually

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
 glue= {"StepDefinitions"},

		
		plugin= {"pretty","html:target/HTMLReport/cucumber-reports.html",
		"json:target/jsonreport/Cucumber.json" },
		 monochrome = true
	)


public class TestRunner {
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	}
}
