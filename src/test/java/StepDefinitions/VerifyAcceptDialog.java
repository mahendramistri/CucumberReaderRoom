package StepDefinitions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class VerifyAcceptDialog {
	
	WebDriver driver =null;
	
	@SuppressWarnings("deprecation")
	@Given("chrome browser is open")
	public void chrome_browser_is_open() {
	    System.out.println("Inside browser ");
	    
	   // String projectPath= System.getProperty("user.dir");
	    
	    
	    System.setProperty("webdriver.chrome.driver","C:/Users/rajesh.kushwaha/eclipse-workspace/CucumberReaderRoom/src/test/resources/Drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	   // driver.manage().window().maximize();
	    
	}

	@And("User is on RR Page")
	public void user_is_on_rr_page() throws InterruptedException {
		
		 System.out.println("User is on RR website");
		// driver.navigate().to("https://rr-testing-app.bubbleapps.io/");
	 // Thread.sleep(2000);
			//Set the username
			String username = "rrtest";
			//Set the password
			String password = "standards2022";
				
			String URL = "https://" +username +":" +password +"@"+ "rr-testing-app.bubbleapps.io/";
			driver.get(URL);
	
	System.out.println("Xpath id n pwd");
	}
	
	@When("User Click on Public access link button")
	public void user_click_on__button() throws InterruptedException {
		
		System.out.println("inside public_access_link");
		Thread.sleep(2000);
		//driver.findElement(By.className("bubble-element Group clickable-element")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'bubble-element Group clickable-element')]"));
		System.out.println("after click public_access_link popup is coming for accept");
	}

	@And("Cookie Dialog window open with two button")
	public void cookie_dialog_window_open_with_two_button() throws InterruptedException {
		
		//RR user able to access accept dialog window
		// User can click accept button from popup
		Thread.sleep(2000);
		System.out.println("RR user able to See access accept dialog window");
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		//driver.close();
	}

	@Then("user clicked on Accept button to Stroe session")
	public void user_clicked_on_accept_button_to_stroe_session() {
	
		System.out.println(" Store Cookies values RR user able to check");
		// Store cookies vaules and check n print
		 // create file named Cookies to store Login Information    
		
		//driver.manage().getCookies(); 
		System.out.println(driver.manage().getCookies()); 
		Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies);
        }
	
	driver.close();
	}
}
