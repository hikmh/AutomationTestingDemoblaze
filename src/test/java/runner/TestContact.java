package runner;


import org.openqa.selenium.WebDriver;

import com.setup.driver.pages.Contact;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestContact {
	
	private static WebDriver driver;
	private Contact contact = new Contact();
	private static ExtentTest extentTest;
	
	public TestContact() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to dashboard page in contact")
	public void navigate_to_dashboard_page_in_contact() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to dashboard page in contact"); 
	}
	
	@And("click navbar contact")
	public void click_navbar_contact() {
		contact.ClickNavContact();
	}
	@And("enter {string} as email {string} as name dan {string} as message")
	public void enter_as_email_as_name_dan_as_message(String email, String name, String message) {
		contact.contact(email,name,message);
		extentTest.log(LogStatus.PASS, "enter "+ email+ " as email "+name+" as name dan " + message + " as message"); 
	}

	@And("click button sendMessage")
	public void click_button_sendMessage() {
		contact.clickBtn();
		extentTest.log(LogStatus.PASS, "click button sendMessage");
	}

	@Then("appear popup greating {string} in contact")
	public void appear_popup_greating_in_contact(String String) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}