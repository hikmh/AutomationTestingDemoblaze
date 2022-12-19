 package runner;


import org.openqa.selenium.WebDriver;

import com.setup.driver.pages.Login;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private Login login = new Login();
	private static ExtentTest extentTest;
	
	public TestLogin() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to dashboard page for login")
	public void navigate_to_dashboard_page_for_login() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to dashboard page"); 
	}
	
	@And("click navbar login")
	public void click_navbar_login() {
		login.clickNav();
	}
	@And("enter {string} as username dan {string} as pasword in login")
	public void enter_as_username_dan_as_pasword(String username, String pasword) {
		login.login(username, pasword);
		extentTest.log(LogStatus.PASS, "enter "+ username+ " as username dan " + pasword + " as pasword"); 
	}

	@And("click button login")
	public void click_button_signup() {
		login.clickBtn();
		extentTest.log(LogStatus.PASS, "click button signup");
	}

	@Then("appear popup greating {string} in login")
	public void appear_popup_greating_in_login(String String) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}