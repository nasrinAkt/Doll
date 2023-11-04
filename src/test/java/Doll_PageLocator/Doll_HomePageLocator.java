package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_HomePageLocator extends Doll_Base{
	
	public Doll_HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText ="About Us")
	public WebElement clAU;
	
	@FindBy(linkText ="Event")
	public WebElement clEt;
	
	@FindBy(linkText ="Blog")
	public WebElement clB;
	
	@FindBy(linkText ="Contact")
	public WebElement clContact;
	
	
	@FindBy(linkText ="About Us")
	public WebElement aboutusInHeader;
	
	@FindBy(linkText ="Contact")
	public WebElement contactHeader;
	
}
