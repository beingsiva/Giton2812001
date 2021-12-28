package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class PropertyFileUtility {
	@Test
	public String readDataFromproperty(String key) throws IOException {
		FileInputStream fis= new FileInputStream(IpathConstants.PropertyPath);
		Properties pfile= new Properties();
		pfile.load(fis);
		String value = pfile.getProperty(key);
		return value;
	}

}
