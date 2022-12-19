package runner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Home;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestHome {
	
	private static WebDriver driver;
	private Home home = new Home();
	private static ExtentTest extentTest;
	
	public TestHome() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to home page")
	public void navigate_to_home_page() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to home page"); 
	}
	
	@And("click navbar home")
	public void click_navbar_home() {
		home.clickNavHome();
	}
	@And("scroll down home page")
	public void scroll_down_home_page() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	@And("click menu phones")
	public void click_menu_phones() {
		home.clickMenuPhones();
		extentTest.log(LogStatus.PASS, "click menu phones");
	}
	@And("click card phones")
	public void click_card_phones() {
		home.clickCard();
		extentTest.log(LogStatus.PASS, "click card phones");
	}
	@And("click button add to cart")
	public void click_button_add_to_cart() {
		home.clickBtn();
		extentTest.log(LogStatus.PASS, "click button add to cart");
	}

	@Then("appear popup greeting {string} in home")
	public void appear_popup_greeting_in_home(String string) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}