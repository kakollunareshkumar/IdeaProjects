import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentTypesOfIterationExample {
	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		//1.using for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

		//2. using Iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//3.using ListIterator

		ListIterator<String> l=list.listIterator();

		while(l.hasNext())
		{
			System.out.println(l.next());
		}


	}
}
