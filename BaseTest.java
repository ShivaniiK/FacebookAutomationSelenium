package com.FacebookAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import com.FacebookAssignment.Utility;

public class BaseTest extends Utility {

	public WebDriver driver;
	
	public void intializationDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		this.setDriver(driver);
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%20page%7C&placement=&creative=589460569900&keyword=facebook%20login%20page&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3919153362%26loc_physical_ms%3D1007785%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_PzN2syQ-AIVUDErCh3W_gqIEAAYASAAEgK84fD_BwE");
		driver.manage().window().maximize();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
