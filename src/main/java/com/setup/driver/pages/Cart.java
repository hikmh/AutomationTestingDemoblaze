package com.setup.driver.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Cart {
	
	private WebDriver driver;
	
	public Cart() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[4]/a")
	private WebElement NavCart;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	private WebElement name;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath="//*[@id=\"card\"]")
	private WebElement card;
	
	@FindBy(xpath="//*[@id=\"month\"]")
	private WebElement month;
	
	@FindBy(xpath="//*[@id=\"year\"]")
	private WebElement year;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
	private WebElement btnPurchase;
	
	public void clickNavCart() {
		NavCart.click();
	}
	public void clickPlaceorder() {
		btnPlaceOrder.click();
	}
	public void clickBtnPurchase() {
		btnPurchase.click();
	}

	public void cart (String name, String country, String city, String card, String month, String year) {
		this.name.sendKeys(name);
		this.country.sendKeys(country);
		this.city.sendKeys(city);
		this.card.sendKeys(card);
		this.month.sendKeys(month);
		this.year.sendKeys(year);
		
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