package com.FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BaseTest {
	
	public void setFirstNameOfSignUpPage() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(showFName());
	}
	
	public void setLastNameOfSignUpPage() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(showLName());
		
	}
	
	
	public void passWord() {
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(setPassword());
		
	}
	
	
	public void getRandomMobile() {
		WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("9765238787");
	}

		
		 
	

	
	}


