package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class first {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
	   driver =new ChromeDriver();
	    driver.manage().window().maximize();
	   
	}
	@Given("user is on demoblaze search page")
	public void user_is_on_demoblaze_search_page() {
	    driver.get("https://www.demoblaze.com/"); 
	}
	

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box()throws InterruptedException {
	   driver.findElement(By.name("q")).sendKeys("IPHONE");
	   Thread.sleep(2000);
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	    
	}

@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() {
	driver.quit();
}
   // driver.get("https://www.demoblaze.com");
    
}
