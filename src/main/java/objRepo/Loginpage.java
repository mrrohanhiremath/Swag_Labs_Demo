package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//username
	@FindBy(xpath = "//input[@id=\"user-name\"]")
	private WebElement username;
	public void getUsername(String value) {
		username.sendKeys(value);
	}
	//password
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;
	public void getPassword(String value) {
		password.sendKeys(value);
	}
	//loginButton
	@FindBy(xpath = "//input[@id=\"login-button\"]")
	private WebElement loginButton;
	public void getLoginButton() {
		loginButton.click();
	}
	

}
