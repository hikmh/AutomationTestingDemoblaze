package runner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Monitors;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMonitors {
	
	private static WebDriver driver;
	private Monitors monitors = new Monitors();
	private static ExtentTest extentTest;
	
	public TestMonitors() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to home page for buying monitors")
	public void navigate_to_home_page_for_buying_monitors() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to home page"); 
	}
	
	@And("click navbar home for buying monitors")
	public void click_navbar_home_for_buying_monitors() {
		monitors.clickNavHome();
	}
	@And("scroll down home page for buying monitors")
	public void scroll_down_home_page_for_buying_monitors() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	@And("click menu monitors")
	public void click_menu_monitors() {
		monitors.clickMenuMonitors();
		extentTest.log(LogStatus.PASS, "click menu phones");
	}
	@And("click card monitors")
	public void click_card_monitors() {
		monitors.clickCard();
		extentTest.log(LogStatus.PASS, "click card phones");
	}
	@And("click button add to cart for buying monitors")
	public void click_button_add_to_cart_for_buying_monitors() {
		monitors.clickBtn();
		extentTest.log(LogStatus.PASS, "click button add to cart");
	}

	@Then("appear popup greeting {string} in home for buying monitors")
	public void appear_popup_greeting_in_home_for_buying_monitors(String string) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}