package Doll_StepDefinition;

import Doll_PageAction.Doll_ContactPageAction;
import Doll_PageAction.Doll_HomePageAction;
import Doll_Utility.Doll_Base;
import cucumber.api.java.en.Then;

public class Doll_Contact extends Doll_Base{
	Doll_HomePageAction doll_HomePageAction = new Doll_HomePageAction();
	Doll_ContactPageAction doll_ContactPageAction = new Doll_ContactPageAction();
	
	@Then("^verify contact display in header$")
	public void verify_contact_display_in_header() throws Throwable {
		doll_HomePageAction.verifycontactdisplayinheader(); 
	}
	@Then("^click on contact link$")
	public void click_on_contact_link() throws Throwable {
		doll_HomePageAction.clickoncontactlink(); 
		
	}

	@Then("^verify contact page display$")
	public void verify_contact_page_display() throws Throwable {
		doll_ContactPageAction.verifycontactpagedisplay();
		
	}


	@Then("^scroll down and enter name invalid email and massage$")
	public void scroll_down_and_enter_name_invalid_email_and_massage() throws Throwable {
		doll_ContactPageAction.scrolldownandenternameinvalidemailandmassage();	
	}

	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
		doll_ContactPageAction.clickonsendbutton();  
	}

	


	
	
	
	
}
