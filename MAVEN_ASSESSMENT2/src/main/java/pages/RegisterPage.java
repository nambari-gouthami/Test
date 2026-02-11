package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	By name=By.name("name");
	By phone=By.name("phone");
	By email=By.name("email");
	By submit=By.xpath("//button[text()='New User']");
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	public void registerUser(String n,String p,String e) {
		driver.findElement(name).sendKeys(n);
		driver.findElement(phone).sendKeys(p);
		driver.findElement(email).sendKeys(e);
		driver.findElement(submit).click();
		
	}

}
