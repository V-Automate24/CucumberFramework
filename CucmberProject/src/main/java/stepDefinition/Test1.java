package stepDefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	
	 static WebDriver driver;
	WebDriverWait wait;
public  void setUp(){
	System.setProperty("webdriver.chrome.driver", "G:/Selenium Automation/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	 wait=new WebDriverWait(driver, 10);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@Given("^I am on the Home Page \"([^\"]*)\" of Erail Website$")
	public void i_am_on_the_Home_Page_of_Erail_Website(String Url) throws Throwable {
		setUp();
		driver.get(Url);
		driver.manage().window().maximize();
		String titlePage=driver.getTitle();
		System.out.println(" Title of page - ----> "+titlePage);
			Assert.assertEquals(titlePage, "Indian Railways Enquiry PNR Status Live Status IRCTC Reservation Seats");
		
	}

	@When("^I move to PNR Status page$")
	public void i_move_to_PNR_Status_page() throws Throwable {
	   driver.findElement(By.xpath("//a[@title='IRCTC Online PNR Status' and contains(@href,'pnr-status')]")).click();
	   
	}

	@When("^validate PNR staus page title$")
	public void validate_PNR_staus_page_title() throws Throwable {
	    String pnrPageTitle=driver.getTitle();
	    wait.until(ExpectedConditions.titleContains("PNR Status Live, PNR Enquiry Online, Indian Railway PNR"));
		Assert.assertEquals(pnrPageTitle, "PNR Status Live, PNR Enquiry Online, Indian Railway PNR");

	
	}

	@When("^Enter the PNR number and click on status button$")
	public void enter_the_PNR_number_and_click_on_status_button() throws Throwable {
	driver.findElement(By.xpath("//input[@class='searchInput']")).sendKeys("4149548729");
	//driver.findElement(By.xpath("//a[text()='Get Status']")).click();
		
	}

	@Then("^I should see PNR status for the passenger$")
	public void i_should_see_PNR_status_for_the_passenger() throws Throwable {
	    wait.until(ExpectedConditions.titleContains("PNR Status Live, PNR Enquiry Online, Indian Railway PNR"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='Chart Prepared']"))));
	    String text=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[6]/td[3]/b")).getText();
	System.out.println(text);
	}

	@After
	public static void tearDown(Scenario scenario)
	{
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
		

}}
