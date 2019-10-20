import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationExample {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("name","naresh");
		map.put("address", "bangalore");
		map.put("school", "guntur");

		System.out.println("using for each loop for iteration over Map.entrySet()");

		for(Map.Entry<String,String> entry:map.entrySet())
		{
			System.out.println("key="+entry.getKey()+ " "+entry.getValue());
		}

		System.out.println("Using KeySet() for iteration over keys");

		for(String name:map.keySet()){
			System.out.println("key"+name);
		}
		for(String value:map.values()){
			System.out.println("value"+value);
		}

		System.out.println("using iterators");

		Iterator<Map.Entry<String,String> >itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			System.out.println("Key="+entry.getKey()+" value="+entry.getValue());
		}
	}

}
