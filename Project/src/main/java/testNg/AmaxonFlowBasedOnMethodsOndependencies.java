package testNg;

import org.testng.annotations.Test;

public class AmaxonFlowBasedOnMethodsOndependencies {
	@Test()
	public void login() {
		System.out.println("amazon logged in");
	}
	
	@Test(dependsOnMethods="logout")
	public void searchProduct() {
		System.out.println("search the product");
	}
	
	@Test(dependsOnMethods ="searchProduct" )
	public void addonCart() {
		System.out.println("product add on to the cart");
	}
	
	@Test(dependsOnMethods = "addonCart")
	public void buyTheProduct() {
		System.out.println("payment done");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
	
}

