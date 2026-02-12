package stepdefinitions;



import org.openqa.selenium.WebDriver;

import Pages.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlinePayment extends PaymentPage {
  WebDriver driver;
  PaymentPage paymentpage;

@Given("user launches the demoblaze website")
public void user_launches_the_demoblaze_website() {
	PaymentPage1();
	paymentpage=new PaymentPage();
	
	}

@Given("user logs in with valid credentials")
public void user_logs_in_with_valid_credentials() throws InterruptedException {
	PaymentPage2();
	
}

@Given("user selects a product and adds to cart")
public void user_selects_a_product_and_adds_to_cart() throws InterruptedException {
	PaymentPage3();
}

@Given("user navigates to cart page")
public void user_navigates_to_cart_page() throws InterruptedException {
	PaymentPage4();
}

@When("user clicks on Place Order")
public void user_clicks_on_place_order() {
	PaymentPage5();
   
}

@When("user fills the order form details")
public void user_fills_the_order_form_details() throws InterruptedException {
	PaymentPage6();
    
}

@When("user clicks on Purchase button")
public void user_clicks_on_purchase_button() {
	PaymentPage7();
   
}

@Then("order should be placed successfully")
public void order_should_be_placed_successfully() throws InterruptedException {
	PaymentPage8();
	
}

}
	
   