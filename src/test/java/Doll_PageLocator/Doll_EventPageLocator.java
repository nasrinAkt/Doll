package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_EventPageLocator extends Doll_Base{

	public Doll_EventPageLocator () {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath ="(//img[@class='schedule-slot-speakers speaker-img-1'])[1]")
	public WebElement clAR;
	
	@FindBy(xpath ="//span[text()='SCHEDULE DETAILS']")
	public WebElement displayeventpage;
}

