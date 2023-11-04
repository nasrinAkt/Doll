package Doll_StepDefinition;

import Doll_PageAction.Doll_AboutUsPageAction;
import Doll_PageAction.Doll_EventPageAction;
import Doll_PageAction.Doll_HomePageAction;
import Doll_Utility.Doll_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Doll_home extends Doll_Base {
	
	Doll_HomePageAction doll_HomePageAction = new Doll_HomePageAction();
	Doll_AboutUsPageAction doll_AboutUsPageAction = new Doll_AboutUsPageAction();
	Doll_EventPageAction doll_EventPageAction = new Doll_EventPageAction();
	
	@Given("^Open <\"([^\"]*)\"> do$")
	public void open_do(String URL) throws Throwable {
		DoLaunchURL(URL);
		
	}
	@Then("^verify about us page in header$")
	public void verify_about_us_page_in_header() throws Throwable {
		doll_HomePageAction.verifyaboutuspageinheader();	
		
	   
	}
	@Then("^click on about us link$")
	public void click_on_about_us_link() throws Throwable {
		
		doll_HomePageAction.clickonaboutuslink(); 
	}

	@Then("^Verify about us page display$")
	public void verify_about_us_page_display() throws Throwable {
		doll_AboutUsPageAction.Verifyaboutuspagedisplay();
		
	}

	@Then("^scroll down and up$")
	public void scroll_down_and_up() throws Throwable {
		doll_HomePageAction.scrolldownandup(); 
		
	}
	

	@Then("^scroll down and welcome to nexteticket is visible$")
	public void scroll_down_and_welcome_to_nexteticket_is_visible() throws Throwable {
		doll_AboutUsPageAction.scrolldownandwelcometonexteticketisvisible();
	    
	}

	@Then("^free registration are clickable$")
	public void free_registration_are_clickable() throws Throwable {
		doll_AboutUsPageAction.scrolldownandfreeregistrationareclickable();
	    
	}

	@Then("^verify user in event page after clicking free registration$")
	public void verify_user_in_event_page_after_clicking_free_registration() throws Throwable {
		doll_EventPageAction.verifyuserineventpageafterclickingfreeregistration();
	   
	}


	
}
