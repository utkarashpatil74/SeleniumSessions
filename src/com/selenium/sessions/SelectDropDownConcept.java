package com.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectDropDownConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new EdgeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
//		WebElement country=driver.findElement(By.name("Country"));
//		System.out.println(country.getText());
//		
//		Select sl=new Select(country);
//		sl.selectByVisibleText("Albania");
//		System.out.println(country.getText());
		// TODO Auto-generated method stub
		
		By country=By.name("Country");
		
		ElementUtils el= new ElementUtils(driver);
		el.doSelectByIndex(country,4);
		el.doSelectByValue(country,"India");
		el.doSelectByText(country, "");
		
		el.doSelectByText(country,"Australia");

	}
	

	
	
	
	}


