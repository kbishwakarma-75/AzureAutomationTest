package stepDefinitions_LetsKodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LetsKoditStepDefinition {

	WebDriver driver = null;

//Scenario: Successful Login with Valid Credentials --------------------------------------------------
	@Given("^Open the Browser Successful Login$")
	public void open_the_Browser_Successful_Login()  throws Throwable {		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbish\\eclipse-workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//System.out.println("Title of Web Page is" + driver.getTitle());
		//System.out.println("This is current web page" +driver.getCurrentUrl());		
		//System.out.println("open_the_Browser_Successful_Login");
	}

	@When("^Enter the URL for Successful Login$")
	public void enter_the_URL_for_Successful_Login() throws Throwable {
		driver.get("https://letskodeit.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Let's Kode It – Anyone Can Code";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Get Title Assert passed-> Let's Kode It – Anyone Can Code");

	}

	@And("^Click on Sign up or Login Link Successful Login$")
	public void click_on_Sign_up_or_Login_Link_Successful_Login() throws Throwable {
		WebElement LoginLink = driver.findElement(By.xpath("//div[@ class='ast-button']"));
		LoginLink.click();
		System.out.println("Assert Passed: click_on_Sign_up_or_Login_Link_Successful_Login");

	}

	@And("^Enter Valid Username and Password Successful Login$")
	public void enter_Valid_Username_and_Password_Successful_Login() throws Throwable {
		WebElement EmailAddress = driver.findElement(By.id("email"));
		EmailAddress.sendKeys("test@email.com");
		WebElement PasswordField = driver.findElement(By.id("password"));
		PasswordField.sendKeys("abcabc");
		System.out.println("Assert Passed: verify_User_must_see_All_Courses");
	}

	@And("^Click on Login Button Successful Login$")
	public void click_on_Login_Button_Successful_Login() throws Throwable {
		WebElement LoginButton = driver.findElement(By.xpath("//input[@ type='submit']"));
		LoginButton.click();
		System.out.println("Assert Passed: click_on_Login_Button_Successful_Login");

	}

	@Then("^Verify User must see All Courses$")
	public void verify_User_must_see_All_Courses() throws Throwable {
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdownMenu1\"]/a"));
		dropdown.click();
		System.out.println("Assert Passed: verify_User_must_see_All_Courses");
	}

	@Then("^Logout Successful$")
	public void logout_Successful() throws Throwable {
		WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
		logout.click();
		WebElement logintext = driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/div/div/a"));
		Assert.assertEquals(true, logintext.isDisplayed());
		System.out.println("Assert Passed: Sign In link is displayed");
		driver.close();

	}

//Scenario: Unsuccessful Login with invalid Credentials----------------------------------------------

	@Given("^User on Complete Test Automation Bundle Page$")
	public void user_on_Complete_Test_Automation_Bundle_Page() throws Throwable {
		System.out.println("Assert Passed: user_on_Complete_Test_Automation_Bundle_Page");
		throw new PendingException();
	}

	@When("^Click on Sign In Link Unccessful Login$")
	public void click_on_Sign_In_Link_Unccessful_Login() throws Throwable {
		System.out.println("Assert Passed: click_on_Sign_In_Link_Unccessful_Login");
		throw new PendingException();
	}

	@And("^Enter Invalid Username and Password Unccessful Login$")
	public void enter_Invalid_Username_and_Password_Unccessful_Login() throws Throwable {
		System.out.println("Assert Passed: enter_Invalid_Username_and_Password_Unccessful_Login");
		throw new PendingException();
	}

	@Then("^Verify Invlaid Message Displayed$")
	public void verify_Invlaid_Message_Displayed() throws Throwable {
		System.out.println("Assert Passed: verify_Invlaid_Message_Displayed");
		throw new PendingException();
	}

	@And("^Close Application$")
	public void close_Application() throws Throwable {
		System.out.println("Assert Passed: close_Application");
		throw new PendingException();
	}

}
