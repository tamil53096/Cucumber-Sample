package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class datadeivenwithexamples {
	  
	WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\application\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	  
		WebElement username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		username.clear();
		username.sendKeys(string);
		
		WebElement password= driver.findElement(By.xpath("//input[@id=\"Password\"]"));
				password.clear();
				password.sendKeys(string2);
				
				 driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
				 
				 
				   
	}
	
	

}
