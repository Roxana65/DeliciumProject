package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage {

	WebDriver driver;

	public BillingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement prenumeSection;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement numeSection;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement stradaSection;
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement orasSection;
	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement codpostalSection;
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement telSection;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailSection;
	@FindBy(xpath = "//textarea[@name='order_comments']")
	public WebElement commentSection;
	@FindBy(xpath = "//span[@class='woocommerce-terms-and-conditions-checkbox-text']")
	public WebElement policyButton;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement submitOrderButton;
	@FindBy(xpath = "//*[contains(text(),'Vă mulțumim! Comanda dvs. a fost recepționată.')]")
	public WebElement confirmationMessage;

	public void fillInMethod(String prenume, String nume, String strada, String oras, String codpostal, String tel,
			String email, String comment) {
		prenumeSection.sendKeys(prenume);
		numeSection.sendKeys(nume);
		stradaSection.sendKeys(strada);
		orasSection.sendKeys(oras);
		codpostalSection.sendKeys(codpostal);
		telSection.sendKeys(tel);
		emailSection.sendKeys(email);
		commentSection.sendKeys(comment);
	}

}
