package Doll_PageAction;

import org.testng.Assert;

import Doll_PageLocator.Doll_BlogPageLocator;
import Doll_Utility.Doll_Base;
import Doll_Utility.Doll_TestData;

public class Doll_BlogPageAction extends Doll_Base {
	Doll_BlogPageLocator doll_BlogPageLocator = new Doll_BlogPageLocator();
	
	public void searchfordesign() {
		doll_BlogPageLocator.searBu.sendKeys(Doll_TestData.sendk);
	}
	
	public void clicksearchbutton() {
		
		doll_BlogPageLocator.clSear.click();
		
	}
		public void Verifyuserindesignpage() throws Exception {
		Thread.sleep(3000);
	    boolean verif = doll_BlogPageLocator.ver.isDisplayed();	
		Assert.assertTrue(verif);	
			
		}
	}

