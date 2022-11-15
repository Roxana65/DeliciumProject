package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@id='menu-item-34']")
	public WebElement produseButton;
	@FindBy(xpath = "(//i[@class='sydney-svg-icon'])[5]")
	public WebElement cartButton;

	public void clickMethod(WebElement element) {
		element.click();
	}
}