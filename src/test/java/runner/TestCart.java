 package runner;


import org.openqa.selenium.WebDriver;

import com.setup.driver.pages.Cart;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCart {
	
	private static WebDriver driver;
	private Cart cart = new Cart();
	private static ExtentTest extentTest;
	
	public TestCart() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}

	   

	@When("users in navigate home page")
	public void users_in_navigate_home_page() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to home page"); 
	}
	
	@And("click navbar cart")
	public void click_navbar_cart() {
		cart.clickNavCart();
	}
	@And("click place order")
	public void click_place_order() {
		cart.clickPlaceorder();
	}
	@And("fill {string} as name {string} as country {string} as city {string} as card {string} as month {string} as year")
	 public void fill_as_name_as_country_as_city_as_card_as_month_as_year(String name, String country, String city, String card, String month, String year) {
		cart.cart(name,country,city,card,month,year);
		extentTest.log(LogStatus.PASS, "fill "+ name + " as name  " + country + " as country" + city + "as city" + card + "as card" +month+ "as month" + year + "as year"); 
	}
	
	@And("click button purchase")
	public void click_button_purchase() {
		cart.clickBtnPurchase();
	}
	

	@Then("appear popup {string} ")
	public void appear_popup(String String) {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
	extentTest.log(LogStatus.PASS, "appear popup {string}");   
	}


}