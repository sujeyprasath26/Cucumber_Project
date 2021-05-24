package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
@Given("^Open Firefox and start application$")
public void Open_Firefox_and_start_application() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\inc2011\\eclipse-workspace\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://r1.tdesk.dev1:8020/");
	    
	}

@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		
	    
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/div/div[2]/div/div[2]/div/form/div[2]/button")).click();  
	}

}
