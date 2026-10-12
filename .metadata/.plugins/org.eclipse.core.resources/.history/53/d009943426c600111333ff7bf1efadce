package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageLayer.HomePage;
import pageLayer.RegisterPage;

public class Base {

	public WebDriver driver;
	public HomePage page;
	public RegisterPage reg ;
	
	@BeforeTest
	public void initialize() {
		
		//driver= new ChromeDriver();
		String browser = "chromeDriver";
		if(browser.equalsIgnoreCase(browser)) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			driver= new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			driver= new FirefoxDriver();
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		page = new HomePage(driver);
	    reg = new RegisterPage(driver);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
