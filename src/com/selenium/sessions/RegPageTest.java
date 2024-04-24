package com.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil bu =new BrowserUtil();
		
		WebDriver driver=bu.launchBrowser("edge");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn=By.id("input-firstname");
		By ln=By.name("lastname");
		By email=By.cssSelector("#input-email");
		By telephone=By.xpath("//*[@id=\"input-telephone\"]");
		By password=By.id("input-password");
		By confpasswd=By.name("confirm");
		By newsLetterYes=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By newsLetterNo=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By privacyPolicyAgree=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By buttonContinue=By.className("btn-primary");
		By successMessage=By.tagName("h1");
		
	
		
		ElementUtils eu=new ElementUtils(driver);
	
		eu.doSendKeys(fn,"utkarsh");
		eu.doSendKeys(ln,"patil");
		String emailString=StringUtils.randomString();
		
		eu.doSendKeys(email,emailString);
		System.out.println(emailString);
		eu.doSendKeys(telephone, "7972871775");
		eu.doSendKeys(password,"utkarsh@123");
		eu.doSendKeys(confpasswd,"utkarsh@123");
		eu.doClick(newsLetterYes);
		eu.doClick(privacyPolicyAgree);
		eu.doClick(buttonContinue);
		String messageSuccess=eu.doGetElementText(successMessage);
		
		if(messageSuccess.equals("Your Account Has Been Created!"))
		{
			System.out.println("User reg --- Confirm");
		}
		else {
			System.out.println("User reg --- Failed");
		}
		
		String title=bu.getTitle();
		
		System.out.println(title);
		
		String url=bu.getURL();
		
		System.out.println(url);

	}

}
