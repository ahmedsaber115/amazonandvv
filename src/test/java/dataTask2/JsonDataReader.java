package dataTask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader
{
	public String mobileNo , emailid, name , age ;
	
	public void jsonReader (String filepath) throws FileNotFoundException, IOException, ParseException 
	{
		
		File srcfile = new File(filepath);
		
		JSONParser parser =new JSONParser();
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcfile));
		
		for(Object jsonobj : jarray) 
		{
			JSONObject person = (JSONObject) jsonobj ;
			mobileNo = (String) person.get("mobileNo");
			emailid = (String) person.get("emailid");
			name = (String) person.get("name");
			age = (String) person.get("age");
			
		}
		

	}
	
	

}
