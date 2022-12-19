package com.setup.driver.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Login {
	
	private WebDriver driver;
	
	public Login() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='login2']")
	private WebElement NavLogin;
	
	@FindBy(xpath="//*[@id=\"loginusername\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"loginpassword\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement btnLogin;
	
	public void clickNav() {
		NavLogin.click();
		
	}
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtn() {
		btnLogin.click();
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