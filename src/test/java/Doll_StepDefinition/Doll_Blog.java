package Doll_StepDefinition;



import Doll_PageAction.Doll_BlogPageAction;
import Doll_PageAction.Doll_HomePageAction;
import Doll_Utility.Doll_Base;
import cucumber.api.java.en.Then;

public class Doll_Blog extends Doll_Base{
	Doll_HomePageAction doll_HomePageAction = new Doll_HomePageAction();
	Doll_BlogPageAction doll_BlogPageAction = new Doll_BlogPageAction();
	
	@Then("^click on Blog link$")
	public void click_on_Blog_link() throws Throwable {
		doll_HomePageAction.clickonBloglink();
	}

	@Then("^search for design$")
	public void search_for_design() throws Throwable {
		doll_BlogPageAction.searchfordesign();  
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		doll_BlogPageAction.clicksearchbutton();
	}

	@Then("^Verify user in design page$")
	public void verify_user_in_design_page() throws Throwable {
		doll_BlogPageAction.Verifyuserindesignpage();
	}


	
	
	
	
}
