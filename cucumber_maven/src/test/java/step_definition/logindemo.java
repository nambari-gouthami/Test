package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class logindemo {
	WebDriver driver;
	@Given("browser is open on google")
	public void browser_is_open() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is on google search page with user")
	public void user_is_on_google_search_page() {
		driver.get("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("^user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username,String password)throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login-button")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
