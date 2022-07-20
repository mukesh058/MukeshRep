package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*import org.junit.runner.RunWith;  	//This is to run Test Script with Junit
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
glue = {"stepDefination"})
public class testRunner1 {
}*/

@CucumberOptions(features = "src//test//resources//Features",
glue = {"stepDefination"},
plugin = {"pretty","html:target/HTML_Reports.html","json:target/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Reports/junit_report.xml"})
public class testRunner1 extends AbstractTestNGCucumberTests{
	
}


