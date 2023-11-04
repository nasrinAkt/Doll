package Doll_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Doll_PageLocator.Doll_EventPageLocator;
import Doll_Utility.Doll_Base;

public class Doll_EventPageAction extends Doll_Base{

	Doll_EventPageLocator doll_EventPageLocator = new Doll_EventPageLocator();
	
	public void scrolldownclickonAgatonRonalddo() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		Thread.sleep(3000);
		doll_EventPageLocator.clAR.click();
		
	}
	
	public void verifyuserineventpageafterclickingfreeregistration() throws Exception {
		
	Thread.sleep(2000);	
	boolean verification = doll_EventPageLocator.displayeventpage.isDisplayed();
	Assert.assertTrue(verification);	
	
	}
}
