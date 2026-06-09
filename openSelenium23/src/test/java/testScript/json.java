package testScript;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class json {
	
	@Test
	public void test1() throws IOException, ParseException
	{
			
	
	JSONParser par = new JSONParser();
	FileReader reader = new FileReader("C:\\Users\\srivi\\OneDrive\\Desktop\\code\\Jsondata.json");
	Object obj = par.parse(reader);
	JSONObject map=(JSONObject)obj;
	
	String url = (String)map.get("Url");
	System.out.println(url);
	String username =(String)map.get("username");
	System.out.println(username);
	String password =(String)map.get("password");
	System.out.println(password);
	}
	
	

}
