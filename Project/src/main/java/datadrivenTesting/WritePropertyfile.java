package datadrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WritePropertyfile {
	@Test
	public void writepropertyfile() throws IOException {
		FileOutputStream fos= new FileOutputStream("./SampleCommonData.properties.txt");
		//convert the psysical file into java object
		Properties p= new Properties();
		p.setProperty("name", "SIvasakti");
		p.setProperty("institute", "stark");
		p.setProperty("name", "stark");
		p.setProperty("petname", "stark");
		p.store(fos, "written by siva");
		
		
		
		
	}

}
