import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		System.out.println("Map Example");
		Map<String,String> map=new HashMap();
		//Hashmap allows duplicate keys and values but it will replace with most recent duplicate key and value
		map.put(null, null);
		map.put(null, "kishore");
		map.put("one", "naresh");
		map.put("one", "naresh");
		System.out.println(map);

		for(Map.Entry<String,String> map1:map.entrySet())
		{
			System.out.println("Printing keys and values of map"+" "+map1.getKey()+"--->"+map1.getValue());

		}



	}

}

//Output
//	Map Example
//{null=kishore, one=naresh}
//		Printing keys and values of map null--->kishore
//		Printing keys and values of map one--->naresh