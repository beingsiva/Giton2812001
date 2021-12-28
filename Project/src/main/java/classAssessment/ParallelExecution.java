package classAssessment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Parameters("browser")
	@Test
	public void parallel(String browser) {
		System.out.println("run");
		
	}

}
