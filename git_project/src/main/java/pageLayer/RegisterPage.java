package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
		
		
	}
	@FindBy(id="input-firstname")
	private WebElement nam;
	
	@FindBy(id="input-lastname")
	private WebElement lastnm;
	
	@FindBy(id="input-email")
	private WebElement inputemail;
	
	@FindBy(id="input-telephone")
	private WebElement input_telephone;
	
	@FindBy(id="input-password")
	private WebElement input_password;
	
	@FindBy(id="input-confirm")
	private WebElement confirm_password;
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement button;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement cont;
	
	public void first_name(String name) {
		nam.sendKeys(name);
	}
	public void Lastname(String lname) {
		lastnm.sendKeys(lname);
	}
	public void input_mail(String mail) {
		inputemail.sendKeys(mail);
	}
	public void telephone(String tel) {
		input_telephone.sendKeys(tel);
	}
	public void password(String pass) {
		input_password.sendKeys(pass);
	}
	public void cnfrmpass(String pass1) {
		confirm_password.sendKeys(pass1);
	}
	public void btn() {
		button.click();
	}
	public void plc() {
		policy.click();
	}
	public void conti() {
		cont.click();
	}

}
