package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_AgatonRonaldPageLocator extends Doll_Base {

	public Doll_AgatonRonaldPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath ="//li[text()='Agaton Ronald']")
	public WebElement verify;
	
	
}
