package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperty {

	public static void main(String[] args) throws IOException{
		FileInputStream fis= new FileInputStream("./SampleCommonData.properties.txt");
		Properties pfile=new Properties();
		pfile.load(fis);
		String un = pfile.getProperty("username");
		String pwd = pfile.getProperty("password");
		String brw = pfile.getProperty("Url");
		System.out.println(brw);
		System.out.println(un);
		System.out.println(pwd);

	}

}
