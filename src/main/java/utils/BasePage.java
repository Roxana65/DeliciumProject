package utils;

import pages.BillingPage;
import pages.CartPage;
import pages.HomePage;
import pages.ProdusePage;

public class BasePage extends BaseTest {

	public HomePage home = new HomePage(driver);
	public ProdusePage produse = new ProdusePage(driver);
	public CartPage cart = new CartPage(driver);
	public BillingPage billing = new BillingPage(driver);
}
