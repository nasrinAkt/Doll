package Doll_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Doll_Utility.Doll_Base;

public class Doll_ContactPageLocator extends Doll_Base {

	
public Doll_ContactPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="form-field-name")
	public WebElement typeName;
	
	@FindBy(id="form-field-email")
	public WebElement typeEmail;
	
	@FindBy(id="form-field-message")
	public WebElement typeMassage;
	
	@FindBy(xpath ="(//span[text()='Send'])[1]")
	public WebElement clSend;
	
	@FindBy(css ="div[class='elementor-element elementor-element-6a6aae8 elementor-widget elementor-widget-exhibz-title'] h2[class='section-title']")
	public WebElement verifyContactPage;
	
}
