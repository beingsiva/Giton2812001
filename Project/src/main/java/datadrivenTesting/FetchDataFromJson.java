package datadrivenTesting;

import java.io.FileReader;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;


public class FetchDataFromJson {

	public static void main(String[] args) throws Exception {
		FileReader fr= new FileReader("./javascript.Json");
		JSONParser jp= new JSONParser();
		Object parsedfile = jp.parse(fr);
		System.out.println(parsedfile);
		HashMap<?, ?> siva= (HashMap<?, ?>) parsedfile;
		System.out.println(siva);
		//String un = siva.get("username").toString();
		System.out.println(siva.get("username"));
		System.out.println(siva.get("password"));
		

	}

}
