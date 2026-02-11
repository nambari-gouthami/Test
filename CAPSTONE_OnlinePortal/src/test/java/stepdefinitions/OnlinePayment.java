package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlinePayment {
  WebDriver driver;

@Given("user launches the demoblaze website")
public void user_launches_the_demoblaze_website() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	}

@Given("user logs in with valid credentials")
public void user_logs_in_with_valid_credentials() throws InterruptedException {
	driver.findElement(By.id("login2")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("loginusername")).sendKeys("Pujitha005");
	driver.findElement(By.id("loginpassword")).sendKeys("1234pujitha");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(2000);
}

@Given("user selects a product and adds to cart")
public void user_selects_a_product_and_adds_to_cart() throws InterruptedException {
	
	driver.findElement(By.linkText("Samsung galaxy s6")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Add to cart")).click();
	Thread.sleep(2000);
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
}

@Given("user navigates to cart page")
public void user_navigates_to_cart_page() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cart"))).click();
	driver.findElement(By.linkText("Cart")).click();
	Thread.sleep(2000);
}

@When("user clicks on Place Order")
public void user_clicks_on_place_order() {
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
   
}

@When("user fills the order form details")
public void user_fills_the_order_form_details() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Gouthami");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country"))).sendKeys("India");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city"))).sendKeys("Hyderabad");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("card"))).sendKeys("123456789");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month"))).sendKeys("02");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year"))).sendKeys("2026");
    Thread.sleep(2000);
    
}

@When("user clicks on Purchase button")
public void user_clicks_on_purchase_button() {
	driver.findElement(By.xpath("//button[text()='Purchase']")).click();
   
}

@Then("order should be placed successfully")
public void order_should_be_placed_successfully() throws InterruptedException {
	Thread.sleep(2000);

	WebElement message=driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
	Assert.assertTrue(message.isDisplayed());
			
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.quit();
	
}

}
	
   