package com.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsConcept {

	static WebDriver driver;


	public static void main(String[] args) {
		
		driver=new EdgeDriver();
		
		//util.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		
		
		
//		//1)
//		driver.findElement(By.id("input-email")).sendKeys("utkar");
//		driver.findElement(By.id("input-password")).sendKeys("Nagjdj");
//		
//		//2)
//		
//		WebElement un=driver.findElement(By.id("input-email"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		
//		un.sendKeys("utkar");
//		pwd.sendKeys("Nagjdj");
		
		
		//3)
		
//		By un=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		driver.findElement(un).sendKeys("utkar");
//		driver.findElement(pwd).sendKeys("Nagjdj");
		
		
		//4)
		
//		By un=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		ElementUtils eu=new ElementUtils(driver);
//		WebElement userN=eu.getElement(un);
//		WebElement passW=eu.getElement(pwd);
//		
//		userN.sendKeys("umf");
//		passW.sendKeys("xhsdj");
		
		
		//5)
		
//		ElementUtils eu=new ElementUtils(driver);
//		By un=By.id("input-email");
//		By pwd=By.id("input-password");
//
//		eu.doSendKeys(un,"Utkarsh");
//		
//		eu.doSendKeys(pwd,"utmsj@4343");
		
		//6)
		
		String user_name="input-email";
		String pd="input-password";
		
		ElementUtils eu=new ElementUtils(driver);
		
		eu.doSendKeys("id",user_name,"utkarsh");
		eu.doSendKeys("id",pd,"udp");
		
		
		
	}

}
