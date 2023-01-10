package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class datatablewithoutheader {
	 
	WebDriver driver;
	
	@Given("you are on the login page")
	public void you_are_on_the_login_page() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\application\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("you enter the below credentials")
	public void you_enter_the_below_credentials(DataTable dataTable) {
	
		List<List<String>> data= dataTable.asLists(String.class);
		String uname =data.get(0).get(0);
		String pword = data.get(0).get(1);
		WebElement username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
				username.clear();
				username.sendKeys(uname);
				
				WebElement password= driver.findElement(By.xpath("//input[@id=\"Password\"]"));
						password.clear();
						password.sendKeys(pword);
		
		
	}

	@When("click the login button")
	public void click_the_login_button() {
	    driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
	    driver.close();
	}
}
