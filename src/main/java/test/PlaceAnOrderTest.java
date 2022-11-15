package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class PlaceAnOrderTest extends BaseTest {

	// verificam daca putem plasa o comanda cu succes

	@Test
	public void placeTheOrder() throws InterruptedException {
		page.home.clickMethod(page.home.produseButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.cart.agreeButton));
		page.home.clickMethod(page.cart.agreeButton);

		page.home.clickMethod(page.produse.addMorcovi);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(page.produse.seeCart));
		page.home.clickMethod(page.home.cartButton);
		page.cart.increase();
		page.home.clickMethod(page.cart.updateCartButton);
		Thread.sleep(3000);
		assertEquals(page.cart.totalAmount.getText(), "56.00 lei");

		page.cart.scrollMethod(page.cart.orderButton);
		page.billing.fillInMethod("Roxana", "Giurgiu", "Viilor29", "Cluj-Napoca", "400347", "0740000000",
				"grg@yahoo.com", "doar un test");
		Thread.sleep(3000);
		page.home.clickMethod(page.billing.policyButton);
		Thread.sleep(3000);
		page.home.clickMethod(page.billing.submitOrderButton);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(page.billing.confirmationMessage));
		assertTrue(page.billing.confirmationMessage.isDisplayed());
	}
}
