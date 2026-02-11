package TimesOfIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndianTimes {
	WebDriver driver;
	@Given("user open Times of India website")
	public void user_open_times_of_india_website() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://timesofindia.indiatimes.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user selects the Hindi language from the header")
	public void user_selects_the_hindi_language_from_the_header() {
		driver.findElement(By.xpath("//a[contains(text(),'hindi')]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Hindi language page should be displayed")
	public void hindi_language_page_should_be_displayed() {
		String title=driver.getTitle();
		System.out.println("Page Title is:"+title);
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
