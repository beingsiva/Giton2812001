package datadrivenTesting;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	public static void main(String[] args) throws IOException {
	JSONObject obj= new JSONObject();
	obj.put("name", "sakthi");
	obj.put("Course", "civil");
	JSONArray sub= new JSONArray();
	 sub.add("Subject1: DBMS");
     sub.add("Subject2: JAVA");
     sub.add("Subject3: PYTHON");
     obj.put("Subjects:", sub);
     FileWriter fw= new FileWriter("./output.json");
     fw.write(obj.toJSONString());
     System.out.println("JSON Object: " + obj);
     fw.close();
	
		      /*JSONObject obj = new JSONObject();
		      obj.put("Name","Adithya");
		      obj.put("Course", "MCA");
		      JSONArraysubjects = new JSONArray();
		      subjects.add("Subject1: DBMS");
		      subjects.add("Subject2: JAVA");
		      subjects.add("Subject3: PYTHON");
		      obj.put("Subjects:", subjects);
		      File file = new FileWriter("./javascript.Json");
		      file.write(obj.toJSONString());
		      System.out.println("JSON Object write to a File successfully");
		      System.out.println("JSON Object: " + obj);*/
		

	}

}
