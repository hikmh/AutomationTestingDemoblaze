package runner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Laptop;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLaptop {
	
	private static WebDriver driver;
	private Laptop laptop = new Laptop();
	private static ExtentTest extentTest;
	
	public TestLaptop() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to home page for buying laptop")
	public void navigate_to_home_page_for_buying_laptop() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to home page for buying laptop"); 
	}
	
	@And("click navbar home for buying laptop")
	public void click_navbar_home_for_buying_laptop() {
		laptop.clickNavHome();
	}
	@And("scroll down home page for buying laptop")
	public void scroll_down_home_page_for_buying_laptop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	@And("click menu laptop")
	public void click_menu_laptop() {
		laptop.clickMenuLaptop();
		extentTest.log(LogStatus.PASS, "click menu phones");
	}
	@And("click card laptop")
	public void click_card_laptop() {
		laptop.clickCard();
		extentTest.log(LogStatus.PASS, "click card phones");
	}
	@And("click button add to cart for buying laptop")
	public void click_button_add_to_cart_for_buying_laptop() {
		laptop.clickBtn();
		extentTest.log(LogStatus.PASS, "click button add to cart");
	}

	@Then("appear popup greeting {string} in home for buying laptop")
	public void appear_popup_greeting_in_home_for_buying_laptop(String string) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup greeting {string}");   
	}

}