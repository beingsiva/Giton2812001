package testNg;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void createCustomer() {
		System.out.println("execute create customer");
		int[] arr= {1,2,3};
		System.out.println(arr[2]);
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		System.out.println("execute modify customer");
	}
	
	@Test(dependsOnMethods = "modifyCustomer")
	public void deletecustomer() {
		System.out.println("execute deletecustomer");
	}
}
