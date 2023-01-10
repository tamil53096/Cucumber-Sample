package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class opengoogle {

	WebDriver driver;

	@Given("^user is entering Google\\.com$")
	public void user_is_entering_Google_com() throws Throwable {

		System.setProperty("webdriver.gecko.driver", "D:\\java\\application\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

	@When("^types the search term as \"([^\"]*)\"$")
	public void types_the_search_term_as(String arg1) throws Throwable {

		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys(arg1);
		

	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {

		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys(Keys.RETURN);

	}

	@Then("^the user should see the search results for cattle farming$")
	public void the_user_should_see_the_search_results_for_cattle_farming() throws Throwable {

		/* boolean status = driver.findElement(By.partialLinkText("cattle")).isDisplayed();
		if (status) {
			System.out.println("Result displayed");
		}*/
		
		driver.close();
	}
	

}
