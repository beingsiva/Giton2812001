package classAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MockReadingFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./SampleCommonData.properties.txt");
		Properties p= new Properties();
		p.load(fis);
		String pet = p.getProperty("petname");
		String names = p.getProperty("name");
		String ins = p.getProperty("institute");
		System.out.println(pet);
		System.out.println(names);
		System.out.println(ins);
	}

}
