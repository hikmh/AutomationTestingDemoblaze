package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.setup.driver.driver.DriverSingleton;

public class Contact {
	private WebDriver driver; 
	
	public Contact() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[2]/a")
	private WebElement ClickNavContact;
	
	@FindBy(xpath="//*[@id=\"recipient-email\"]")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"recipient-name\"]")
	private WebElement name;
	
	@FindBy(xpath="//*[@id=\"message-text\"]")
	private WebElement message;
	
	@FindBy(xpath="//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
	private WebElement clicksendMessage;
	
	
	public void ClickNavContact() {
		ClickNavContact.click();
	}
	public void contact(String email, String name, String message) {
		this.email.sendKeys(email);
		this.name.sendKeys(name);
		this.message.sendKeys(message);
	}
	
	public void clickBtn() {
		clicksendMessage.click();
	}
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
