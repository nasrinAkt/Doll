package Doll_PageAction;

import org.testng.Assert;

import Doll_PageLocator.Doll_AgatonRonaldPageLocator;
import Doll_Utility.Doll_Base;

public class Doll_AgatonRonaldPageAction extends Doll_Base {

	Doll_AgatonRonaldPageLocator doll_AgatonRonaldPageLocator = new Doll_AgatonRonaldPageLocator();
	
	public void  VerifyAgatonRonaldpagedisplay() throws Exception {
		Thread.sleep(3000);
	boolean veri = doll_AgatonRonaldPageLocator.verify.isDisplayed();
	Assert.assertTrue(veri);	
		
	}
}
