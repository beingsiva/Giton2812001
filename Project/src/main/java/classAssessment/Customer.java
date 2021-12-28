package classAssessment;

import org.testng.annotations.Test;

public class Customer {
	@Test()
	public void createCustomer() {
		System.out.println("Created customer");
		
	}
	
	@Test(dependsOnMethods="createCustomer")
	public void modifyCustomer() {
		System.out.println("ModifiedCustomer details");
	}

	@Test(dependsOnMethods="modifyCustomer")
	public void deleteCustomer() {
		System.out.println("deleted customer details");
	}
}
