package fileUtility;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


public class JsonFileUtility {
@Test
	public String readDataFromJson(String key) throws IOException, ParseException {
		FileReader fr= new FileReader("./javascript.Json");
		JSONParser jp= new JSONParser();
		Object parsedfile = jp.parse(fr);
		HashMap<?,?> map= (HashMap<?,?>) parsedfile;
		String value = map.get(key).toString();
		return value;
		
	}

}
