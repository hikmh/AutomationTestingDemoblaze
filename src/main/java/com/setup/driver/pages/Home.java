package com.setup.driver.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Home {
	
	private WebDriver driver;
	
	public Home() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[1]/a")
	private WebElement NavHome;
	
	@FindBy(xpath="//*[@id=\"itemc\"]")
	private WebElement MenuPhones;
	
	@FindBy(xpath="//*[@onclick=\"byCat('laptop')\"]")
	private WebElement MenuLaptop;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	private WebElement Card;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	private WebElement btnAddtoCart;
	
	public void clickNavHome() {
		NavHome.click();
		
	}
	public void home() {
		System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");

		   driver.navigate().to("https://demoblaze.com/index.html"); // Specify the Website URL

		   //to perform scroll on an application using Selenium
	}
	public void clickMenuPhones() {
		delay(2);
		MenuPhones.click();
	}
	public void clickCard() {
		delay(2);
		Card.click();
	}
	public void clickBtn() {
		delay(2);
		btnAddtoCart.click();
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