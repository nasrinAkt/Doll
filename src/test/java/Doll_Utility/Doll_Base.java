package Doll_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



   public class Doll_Base {
   public static WebDriver driver;
	public static Properties DoPro;
	
	public Doll_Base() {
		try {
			FileInputStream doFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Doll_Config//Doll_Config.Properties"));
			DoPro = new Properties();
			DoPro.load(doFle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please,look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void DoBrowser() {
	String DoAllBrowser	= DoPro.getProperty("DoBrowser1");
	
	if(DoAllBrowser.equalsIgnoreCase("Chrome")) {
	System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Doll_ChromeDriver//chromedriver.exe"));
	ChromeOptions dd = new ChromeOptions();
	dd.addArguments("--remote-allow-origins=*"); 
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Doll_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Doll_Utiliti.implicitlyWait));
    driver.manage().window().maximize();	
				
			
			
			
		}
		else if(DoAllBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Doll_EdgeDriver//msedgedriver.exe"));
			EdgeOptions dd1 = new EdgeOptions();
			dd1.addArguments("--remote-allow-origins=*"); 
			driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Doll_Utiliti.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Doll_Utiliti.implicitlyWait));
		    driver.manage().window().maximize();	
							
			
		}
		
	}
	
	public static void DoLaunchURL(String URL) {
		
		driver.get(DoPro.getProperty("DoURL"));
		
		
	}
	
}
