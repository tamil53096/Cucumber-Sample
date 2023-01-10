package stepdefinition;

import io.cucumber.java.en.Given;

public class expressions {

	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	   System.out.println("laptop count" + int1);
	}

	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double double1) {
	   System.out.println("CGPA" + double1);
	}

	@Given("{string} is elder to {string}")
	public void is_elder_to(String string, String string2) {
	    System.out.println(string + " is elder than " + string2);
	}

}
