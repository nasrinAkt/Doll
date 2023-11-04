package Doll_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Doll_PageLocator.Doll_AboutUsPageLocator;
import Doll_Utility.Doll_Base;

public class Doll_AboutUsPageAction extends Doll_Base {

	Doll_AboutUsPageLocator doll_AboutUsPageLocator = new Doll_AboutUsPageLocator();
	
	
	public void Verifyaboutuspagedisplay() throws Exception  {
	Thread.sleep(2000);
    boolean veri = doll_AboutUsPageLocator.verify.isDisplayed();
	Assert.assertTrue(veri);
		
	}
	
	public void scrolldownandwelcometonexteticketisvisible() throws Exception {
	
	((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
   Thread.sleep(2000);	
   boolean veri = doll_AboutUsPageLocator.welcomeMassage.isDisplayed();	
   Assert.assertTrue(veri);
   
	}
	public void scrolldownandfreeregistrationareclickable() throws Exception {
		
	((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
	
	Thread.sleep(2000);
	doll_AboutUsPageLocator.clFreeRegis.click();
		
	}
	
}
