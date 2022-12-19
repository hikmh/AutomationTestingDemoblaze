package com.setup.driver.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Sign {
	
	private WebDriver driver;
	
	public Sign() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//a[@id='signin2']")
	private WebElement NavSignUp;
	
	@FindBy(xpath="//*[@id=\"sign-username\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"sign-password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	private WebElement btnSignUp;
	
	public void clickNav() {
		NavSignUp.click();
	}
	
	public void sign(String username, String pasword) {
		this.username.sendKeys(username);
		this.password.sendKeys(pasword);
	}
	
	public void clickBtn() {
		btnSignUp.click();
	}
	
	public void Alert() {
		Alert alert = driver.switchTo().alert();
		delay(2);
		alert.accept();
	       
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