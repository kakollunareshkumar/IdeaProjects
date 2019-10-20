import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSimpleWriterExample {
	public static void main(String[] args) {

		JSONObject obj=new JSONObject();
		obj.put("name", "mykong.com");
		obj.put("age", 100);

		JSONArray list=new JSONArray();
		list.add("msg1");
		list.add("msg2");
		list.add("msg3");

		obj.put("messages", list);

		try(FileWriter file=new FileWriter("c:\\leag\\json\\test.json"))

		{
			file.write(obj.toJSONString());
			System.out.println("written json data successfully");
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
}
