package Doll_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Doll_PageLocator.Doll_ContactPageLocator;
import Doll_Utility.Doll_Base;
import Doll_Utility.Doll_TestData;


public class Doll_ContactPageAction extends Doll_Base{

	Doll_ContactPageLocator doll_ContactPageLocator = new Doll_ContactPageLocator();
	
	public void verifycontactpagedisplay() throws Exception {
		
	Thread.sleep(2000);	
	boolean verify	= doll_ContactPageLocator.verifyContactPage.isDisplayed();
	Assert.assertTrue(verify);	
	
	}
	public void scrolldownandenternameinvalidemailandmassage() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		Thread.sleep(2000);
		
		doll_ContactPageLocator.typeName.sendKeys(Doll_TestData.enterName);
		Thread.sleep(2000);
		
		doll_ContactPageLocator.typeEmail.sendKeys(Doll_TestData.enterEmail);
		Thread.sleep(2000);
		
		doll_ContactPageLocator.typeMassage.sendKeys(Doll_TestData.enterMassage);
		Thread.sleep(2000);
		
		doll_ContactPageLocator.typeMassage.clear();//clear()
		Thread.sleep(2000); 
		
//	Actions ac = new Actions(driver);//using actions class
	
   // ac.moveToElement(doll_ContactPageLocator.typeMassage).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	
	//ac.moveToElement(doll_ContactPageLocator.typeMassage).keyDown(Keys.CONTROL).sendKeys("a",Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		
	//ac.moveToElement(doll_ContactPageLocator.typeMassage).keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).keyUp(Keys.CONTROL).perform();	
	//ac.moveToElement(doll_ContactPageLocator.typeMassage).keyDown(Keys.CONTROL).sendKeys("a",Keys.SPACE).keyUp(Keys.CONTROL).perform();	
	
	//ac.moveToElement(doll_ContactPageLocator.typeMassage).keyDown(Keys.CONTROL).sendKeys("a","x").keyUp(Keys.CONTROL).perform();	
	
		
	
	//Using sendkeys clear the text from input field
	
	//doll_ContactPageLocator.typeMassage.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	//doll_ContactPageLocator.typeMassage.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	//doll_ContactPageLocator.typeMassage.sendKeys(Keys.CONTROL,"a","x");
	
	
	}
	public void clickonsendbutton() {
		doll_ContactPageLocator.clSend.click();
		
		
	}
	
}
