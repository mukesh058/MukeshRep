package stepDefination;

import Pages.page1;
import browser.Browser;
import io.cucumber.java.en.*;

public class Cucum1 
{
	@Given("User on the webpage {string}.")
	public void user_on_the_webpage(String string) {
	   try {
		   Browser.openBrowser();
		   Browser.openUrl(string);
		
	        } catch (Exception e) {
	        	e.printStackTrace();
	       }
	}

	@And("User passes {string}")
	public void user_passes(String string) {
		try {
			page1.enterUserName(string);
			Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
	   
	}

	@And("User enter {string}")
	public void user_enter(String string) {
	    try {
	    	page1.enterPassward(string);
			Thread.sleep(1000);
	    	} catch (Exception e) {
			e.printStackTrace();
	    	}
	}

	@When("click on the loginButton")
	public void click_on_the_login_button() {
	    try {
	    	page1.clickLogin();
			
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

	@Then("user navigate to product catalog page")
	public void user_navigate_to_product_catalog_page() {
		try {
				page1.navigateTheproduct();
				Thread.sleep(3000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		Browser.browserClose();
	   
	}


}
