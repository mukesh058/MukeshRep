package stepDefination;

import org.testng.Assert;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucum {
	
	@Given("Open a browserr")
	public void open_a_browserr() {
		try {
			Browser.openBrowser();
		} catch (Exception e) {
			System.out.println(e);		
		}
	    
	}

	@When("Enter a {string}.")
	public void enter_a(String string) {
		try {
			Browser.openUrl(string);
		} catch (Exception e) {
			System.out.println(e);
		}
	    
	}

	@Then("Page will displayed.")
	public void page_will_displayed() {
	    String actualTitle=Browser.getTitle();
	    Assert.assertEquals("Swag Labs", actualTitle);
	    Browser.browserClose();
	}

}
