import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
public class JsonReaderExample {
	public static void main(String[] args) {
		JSONParser jsonParser=new JSONParser();
		Reader reader= null;
		try {
			reader = new FileReader("c:\\leag\\jsonbig.json");
			JSONObject jsonObject = (JSONObject)jsonParser.parse(reader);
			System.out.println("Full JSON Response" + jsonObject);
			String firstname = (String) jsonObject.get("firstname");
			String lastname = (String) jsonObject.get("lastname");
			System.out.println("firstname of person" + " " + firstname);
			System.out.println("lastname of person" + " " + lastname);
			long age = (long) jsonObject.get("age");
			System.out.println("age of person" + " " + age);
			//getting address
			Map address = (Map) jsonObject.get("address");
			//iterating address map
			Iterator<Map.Entry> iterator1 = address.entrySet().iterator();
			while (iterator1.hasNext()) {
				Map.Entry pair = iterator1.next();
				System.out.println(pair.getKey() + " " + pair.getValue());
			}
			JSONArray jsonArray = (JSONArray) jsonObject.get("phone numbers");
			Iterator iterator = jsonArray.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			}
		catch(FileNotFoundException e){
				e.printStackTrace();
			}
		 catch(IOException e){
				e.printStackTrace();
			} catch(ParseException e){
				e.printStackTrace();
			}
		}
	}

