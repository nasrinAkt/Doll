package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_AboutUsPageLocator extends Doll_Base {

	public Doll_AboutUsPageLocator() {
		
	PageFactory.initElements(driver, this);	
		
		
	}
	@FindBy(xpath ="//span[text()='JOIN THE EVENT']")
	public WebElement verify;
	
	
	
	@FindBy(xpath ="//span[text()='-Your Gateway to Unforgettable Events!']")
	public WebElement welcomeMassage;
	
	@FindBy(xpath ="//span[text()='Free Registration']")
	public WebElement clFreeRegis;
	
}
