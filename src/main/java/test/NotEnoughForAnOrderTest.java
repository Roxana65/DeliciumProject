package test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class NotEnoughForAnOrderTest extends BaseTest {

	//verificam daca apare mesajul de eroare pentru comenzi mai mici de 50 de lei
	@Test
	public void placeOrderUnder50lei() throws InterruptedException {
		page.home.clickMethod(page.home.produseButton);
		page.home.clickMethod(page.produse.addCoarne);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.produse.seeCart));
		page.home.clickMethod(page.home.cartButton);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(page.cart.errorMessage));
		assertTrue(page.cart.errorMessage.isDisplayed());

	}

}
