package com.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CricinfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new EdgeDriver();
		
		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/mumbai-indians-women-vs-up-warriorz-women-6th-match-1417721/live-cricket-score");
		
		List<WebElement> e=driver.findElements(By.xpath("//span[text()='Deepti Sharma']//ancestor::tr/td"));
		
		
		for(int i=1;i<=5;i++)
		{
		WebElement c=e.get(i);
		System.out.println(c);
		
		}

	}

}
