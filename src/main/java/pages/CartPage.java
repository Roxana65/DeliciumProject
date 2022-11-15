package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='woocommerce-error']")
	public WebElement errorMessage;
	@FindBy(xpath = "//i[@class='fa fa-angle-right']")
	public WebElement increaseQuantity;
	@FindBy(xpath = "//button[@name='update_cart']")
	public WebElement updateCartButton;
	@FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
	public WebElement totalAmount;
	@FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
	public WebElement orderButton;
	@FindBy(xpath = "(//a[@role='button'])[7]")
	public WebElement agreeButton;

	public void increase() {
		for (int i = 1; i <= 3; i++) {
			increaseQuantity.click();
		}

	}

	public void scrollMethod(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();

	}

}