package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdusePage {

	WebDriver driver;

	public ProdusePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart'])[1]")
	public WebElement addCoarne;
	@FindBy(xpath = "//a[@class='added_to_cart wc-forward']")
	public WebElement seeCart;
	@FindBy(xpath = "//a[@href='?add-to-cart=2501']")
	public WebElement addMorcovi;

}
