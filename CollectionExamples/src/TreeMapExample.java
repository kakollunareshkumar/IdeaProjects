import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//What is in Common?
//		Both TreeMap and HashMap implement the Map interface, so they don't support duplicate keys.
//
//		They are not thread-safe, so you can't use them safely in a multi-threaded application.
//TreeMap sorts elements in natural order and doesn't allow null keys
//		because compareTo() method throws NullPointerException if compared with null.
//Treemap does  allows duplicate keys and values but it will replace with most recent duplicate key and value
public class TreeMapExample {
	public static void main(String[] args) {

		Map<String,String> map=new TreeMap();
		//map.put(null, null);
		//map.put(null, "kishore");
		map.put("one", "naresh");
		map.put("one", "suresh");
		System.out.println(map);

		for(Map.Entry<String,String> map1:map.entrySet())
		{
			System.out.println("Printing keys and values of map"+" "+map1.getKey()+"--->"+map1.getValue());

		}

		Map m = new TreeMap();
		m.put(1,"naresh");
		m.put(-1,"suresh");
		m.put(0,"Apple");
		m.put(40,"zebra");
		System.out.println(m);
	}

}

//{one=suresh}
//Printing keys and values of map one--->suresh
