package extent_report;

//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReport {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	@BeforeClass
	public void starttest() {
		extent=new ExtentReports();
		spark=new ExtentSparkReporter("target/spark.html");
	}
	@Test
	
	
	public void extenttest() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest("Login Test").assignAuthor("Gouthu").assignCategory("smoke").assignDevice("chrome");
		test.pass("Login Test Successfull");
		test.info("url loaded");
		test.pass("login test completed successfully");
		ExtentTest test1=extent.createTest("HomePage test").assignAuthor("Gouthu").assignCategory("regression");
		test1.pass("HomePage Successfull");
		test1.info("value entered");
		test1.pass("HomePage test fail");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google")) {
			test.log(Status.PASS,"Navigated to the specified URL");
		}
		else {
			test.log(Status.FAIL,"TEst FAiled");
		}
		driver.quit();
	}
	@AfterMethod
	public void teardown() {
		extent.flush();
	}
}


