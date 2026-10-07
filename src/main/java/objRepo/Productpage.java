package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	WebDriver driver;
	public Productpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//dropdown
	@FindBy(xpath = "//select[@data-test=\"product-sort-container\"]")
	private WebElement dropdown;
	public void getDropdown() {
		dropdown.click();
	}
	//cartlogo
	@FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
	private WebElement cartlogo;
	public void getCartlogo() {
		cartlogo.click();
	}
	//hamburger
	@FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
	private WebElement hamburger;
	public WebElement getHamburger() {
		return hamburger;
	}

}
