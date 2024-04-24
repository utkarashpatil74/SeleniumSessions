package com.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttributeConcept {
	
	static WebDriver driver;
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public String getAttribute(By locator,String attribute) {
		return getElement(locator).getAttribute(attribute);
	}

	public static void main(String[] args) {
			
		driver=new EdgeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//List<WebElement> nm=driver.findElements(By.className("form-control"));
		
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		
		GetAttributeConcept gh = new GetAttributeConcept();
		String a=gh.getAttribute(fn,"placeholder");
		String b=gh.getAttribute(ln, "placeholder");
		
		System.out.println(a);
		System.out.println(b);
			
			
		}
	}


