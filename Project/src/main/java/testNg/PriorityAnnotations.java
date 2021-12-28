package testNg;

import org.testng.annotations.Test;

public class PriorityAnnotations {

	@Test(dependsOnGroups = "RT")
	public void createCustomer1() {
		System.out.println("execute create customer");
		int[] arr= {1,2,3};
		System.out.println(arr[2]);
	}
	
	@Test(priority = 2)
	public void modifyCustomer2() {
		System.out.println("execute modify customer");
	}
	
	@Test(dependsOnGroups = "RT")
	public void deletecustomer3() {
		System.out.println("execute deletecustomer");
	}
}
