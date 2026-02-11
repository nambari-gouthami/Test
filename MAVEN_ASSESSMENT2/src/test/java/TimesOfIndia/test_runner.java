package TimesOfIndia;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	

	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/Feature/IndianTimes.feature",glue= {"TimesOfIndia"},
	        monochrome=true,plugin= {"pretty","html:target1/HtmlReports.html","json:target/JSONReports"})

	public class test_runner extends AbstractTestNGCucumberTests{

	}

	


