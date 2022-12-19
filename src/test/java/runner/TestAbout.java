package runner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.About;
import com.setup.driver.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbout{
	
	private static WebDriver driver;
	private About about = new About();
	private static ExtentTest extentTest;
	
	public TestAbout() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("Navigate to home page for about us")
	public void navigate_to_home_page_for_about_us() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to home page for about us"); 
	}
    @And("click navbar aboutus")
    public void click_navbar_aboutus() {
    	about.clickNavAbout();
    	
    }
    @Then("play video")
    public void play_video() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js .executeScript("document.getElementById(\"example-video_html5_api\").play()");
    
    	
    }
    
}