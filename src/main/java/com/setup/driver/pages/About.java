package com.setup.driver.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;


import com.setup.driver.driver.DriverSingleton;

public class About {
	private WebDriver driver; 
	
	public About() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[3]/a")
	private WebElement clickNavAbout;
	
	public void clickNavAbout() {
		clickNavAbout.click();
	}
	public void about() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js .executeScript("document.getElementById(\"example-video_html5_api\").play()");
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