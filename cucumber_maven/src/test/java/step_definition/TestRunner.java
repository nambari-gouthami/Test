package step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Feature/test.feature",glue= {"step_definition"},
        monochrome=true,plugin= {"pretty","html:target1/HtmlReports.html","json:target/JSONReports"})

public class TestRunner extends AbstractTestNGCucumberTests{

}
