package Doll_TestRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Doll_Utility.Doll_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features= {"src/test/resources/Doll_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Doll_StepDefinition",tags={"@tag3"})

public class Doll_TestRunner extends AbstractTestNGCucumberTests {

	
	@BeforeTest
	public void doStartURL() {
	Doll_Base dol = new Doll_Base();
	dol.DoBrowser();
		
		
	}
	@AfterTest
	public void doCloseURL() {
		
		Doll_Base dol = new Doll_Base();
		dol.driver.quit();
	}
	
	
	
}
