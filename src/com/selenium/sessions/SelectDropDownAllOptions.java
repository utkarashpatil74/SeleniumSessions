package com.selenium.sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		getAllCountryValues(country);

	}

	public static List<String> getDropDownTextList(By locator) {

		List<WebElement> options = doGetAllOptions(locator);
		List<String> countryValue = new ArrayList<>();
		for (WebElement e : options) {

			String c = e.getText();

			countryValue.add(c);

		}
		return countryValue;

	}

	public static List<WebElement> doGetAllOptions(By locator) {

		WebElement county = driver.findElement(locator);

		Select select = new Select(county);
		return select.getOptions();
	}

	public static int doGetAllOptionsSize(By locator) {

		return doGetAllOptions(locator).size();
	}

	public static void getAllCountryValues(By locator) {

		

		List<String> f=getDropDownTextList(locator);
		
		System.out.println(f);
	}
}
