package Doll_PageAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Doll_PageLocator.Doll_HomePageLocator;
import Doll_Utility.Doll_Base;
import Doll_Utility.Doll_Utiliti;

public class Doll_HomePageAction extends Doll_Base {

	Doll_HomePageLocator doll_HomePageLocator = new Doll_HomePageLocator();
	
	public void verifyaboutuspageinheader() {
	boolean verify = doll_HomePageLocator.aboutusInHeader.isDisplayed();
	Assert.assertTrue(verify);	
				
	}
	public void clickonaboutuslink() {
		
	doll_HomePageLocator.clAU.click();
	Doll_Utiliti.takeMyScreenshot(driver, "About us page");
		
	}
	
    public void scrolldownandup() throws Exception {
    	
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	System.out.println("Scroll down performed");
	Thread.sleep(3000);
		
	act.sendKeys(Keys.PAGE_UP).build().perform();
	System.out.println("Scroll up performed");
	Thread.sleep(3000);
	}
    
	public void clickoneventlink() {
	doll_HomePageLocator.clEt.click();
	Doll_Utiliti.takeMyScreenshot(driver, "event page");
		
	}
	
	public void clickonBloglink() {
		doll_HomePageLocator.clB.click();	
		Doll_Utiliti.takeMyScreenshot(driver, "blog page");
	}
	public void verifycontactdisplayinheader() throws Exception {
		
	Thread.sleep(2000);
	boolean visible	= doll_HomePageLocator.contactHeader.isDisplayed();	
	Assert.assertTrue(visible);	
	
	}
	
	public void clickoncontactlink() {
	doll_HomePageLocator.clContact.click();	
	Doll_Utiliti.takeMyScreenshot(driver, "contact page");
		
	}
	
	
}
