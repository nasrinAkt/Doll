package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_BlogPageLocator extends Doll_Base {

	
	public Doll_BlogPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(name ="s")
	public WebElement searBu;
	
	@FindBy(xpath ="//button[@class='input-group-btn']")
	public WebElement clSear;
	
	@FindBy(xpath ="//li[text()='Search Result']")
	public WebElement ver;
}
