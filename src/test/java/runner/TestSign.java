package runner;


import org.openqa.selenium.WebDriver;

import com.setup.driver.pages.Sign;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSign {
	
	private static WebDriver driver; 
	private static ExtentTest extentTest;
	
	private Sign sign = new Sign();

	public TestSign() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	

	@When("Navigate to dashboard page")
	public void navigate_to_dashboard_page() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to dashboard page"); 
	}
	
	@And("click navbar signup")
	public void click_navbar_signup() {
		sign.clickNav();
	}
	@And("enter {string} as username dan {string} as pasword")
	public void enter_as_username_dan_as_pasword(String username, String pasword) {
		sign.sign(username, pasword);
		extentTest.log(LogStatus.PASS, "enter "+ username+ " as username dan " + pasword + " as pasword"); 
	}

	@And("click button signup")
	public void click_button_signup() {
		sign.clickBtn();
		extentTest.log(LogStatus.PASS, "click button signup");
	}

	@Then("appear popup greating {string}")
	public void appear_popup_greating(String String) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}