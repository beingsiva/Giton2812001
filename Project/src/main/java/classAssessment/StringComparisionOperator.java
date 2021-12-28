package classAssessment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringComparisionOperator {

    @Parameters("browser")
	@Test
	public void compare() {
		
		String s1=new String("abc");         //creating string object using new keyword
		String s2= new String("abc");
		System.out.println(s1==s2);         //comparing memory address
		System.out.println(s1.equals(s2)); // comparing content of object
		
	}

}
