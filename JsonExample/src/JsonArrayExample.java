import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class JsonArrayExample {
	public static void main(String[] args) {
		JSONParser jsonParser=new JSONParser();
		try {

			Object obj = new JSONParser().parse(new FileReader("c:\\leag\\jsonbig.json"));

			// typecasting obj to JSONObject
			JSONObject jsonObject = (JSONObject) obj;
			String firstname = (String) jsonObject.get("name");
			System.out.println(firstname);
			String location = (String) jsonObject.get("location");
			System.out.println(location);


			String id=(String)jsonObject.get("id");
			int i=Integer.parseInt(id);
			System.out.println("parsed string to num"+"--->"+i);


			System.out.println("Full JSON Response" + jsonObject);

			JSONArray jsonArray=(JSONArray)jsonObject.get("employees");
			System.out.println("Total Json  Array Response"+"--->"+jsonArray);

			Iterator<JSONObject> iterator =jsonArray.iterator();
			while (iterator.hasNext())
			{
				JSONObject jsonObject1=(JSONObject)iterator.next();
				String name=(String)jsonObject1.get("firstname");
				System.out.println("Employee Name"+" "+name);

				JSONObject jsonaddress=(JSONObject)jsonObject1.get("address");
				String street=(String)jsonaddress.get("streetAddress");
				System.out.println("Street Address"+" "+street);
				String city=(String)jsonaddress.get("city");
				System.out.println("city"+" "+city);
				String state=(String)jsonaddress.get("state");
				System.out.println("state"+" "+state);
				String postalCode=(String)jsonaddress.get("postalCode");
				System.out.println("postalCode"+" "+postalCode);

				JSONArray jsonArray1=(JSONArray)jsonObject1.get("phonenumbers");
				Iterator<JSONObject> iterator1=jsonArray1.iterator();
				while (iterator1.hasNext())
				{
					JSONObject jsonObject2=(JSONObject)iterator1.next();
					String type=(String)jsonObject2.get("type");
					System.out.println("type of phone number"+"---->"+type);
					String number=(String)jsonObject2.get("number");
					System.out.println("Phonenumber"+"---->"+number);
				}

				String age=(String)jsonObject1.get("age");
				System.out.println("Employee age"+" "+age);
				String lastname=(String)jsonObject1.get("lastname");
				System.out.println("Employee lastname"+" "+lastname);
				System.out.println("===================================================================");

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

