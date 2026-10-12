package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Register'][1]")
	private WebElement Register;
	
	public void Myacc () {
		MyAccount.click();
	}
	public void Reg () {
		Register.click();
	}
	

}
