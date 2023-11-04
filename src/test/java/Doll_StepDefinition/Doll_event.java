package Doll_StepDefinition;

import Doll_PageAction.Doll_AgatonRonaldPageAction;
import Doll_PageAction.Doll_EventPageAction;
import Doll_PageAction.Doll_HomePageAction;
import Doll_Utility.Doll_Base;
import cucumber.api.java.en.Then;

public class Doll_event extends Doll_Base{
	Doll_HomePageAction doll_HomePageAction = new Doll_HomePageAction();
	Doll_EventPageAction doll_EventPageAction = new Doll_EventPageAction();
	Doll_AgatonRonaldPageAction doll_AgatonRonaldPageAction = new Doll_AgatonRonaldPageAction();
	
	@Then("^click on event link$")
	public void click_on_event_link() throws Throwable {
		doll_HomePageAction.clickoneventlink();
		
	}
	@Then("^scrolldown click on Agaton Ronald do$")
	public void scrolldown_click_on_Agaton_Ronald_do() throws Throwable {
		doll_EventPageAction.scrolldownclickonAgatonRonalddo();  
	}


	@Then("^Verify Agaton Ronald page display$")
	public void verify_Agaton_Ronald_page_display() throws Throwable {
		doll_AgatonRonaldPageAction.VerifyAgatonRonaldpagedisplay();
	}


	
	
	
}
