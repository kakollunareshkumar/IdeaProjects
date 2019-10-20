import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonWriteExample {
	public static void main(String[] args) {
		//creating json object
		JSONObject jo=new JSONObject();

		//putting data to JSONObject

		jo.put("firstname","john");
		jo.put("lastname","smith");
		jo.put("age", 25);

		//for address data first create linked hasmap
		Map m=new LinkedHashMap(4);;
		m.put("street Address", "21 2nd street");
		m.put("city", "newyork");
		m.put("state", "NY");
		m.put("postalCode", 10021);

		//putting address to data object
		jo.put("address",m);

		//for  phone numbers, first craete json array

		JSONArray ja=new JSONArray();
		m=new LinkedHashMap(2);
		m.put("type", "home");
		m.put("number","2123456");

		ja.add(m);

		m=new LinkedHashMap(2);
		m.put("type", "fax");
		m.put("number", "224224");

		ja.add(m);

		jo.put("phone numbers", ja);

	try {
		PrintWriter pw = new PrintWriter("c:\\leag\\jsonbig.json");

		pw.write(jo.toJSONString());
		pw.close();
		pw.flush();
		System.out.println("written json text successfully");

	}
	catch (IOException e)
		{
			System.out.println(e);
		}





	}
}
