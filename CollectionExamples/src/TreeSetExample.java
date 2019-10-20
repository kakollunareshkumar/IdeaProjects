import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet s= new TreeSet();
		s.add("naresh");
		s.add("null");
		s.add("naresh");
		s.add("Julia");
		s.add("Robert");
		s.add("Mark");
		s.add("Steven");
		s.add("Banana");
		s.add("banana");
		System.out.println(s);
		// Finding size of a treeset
		System.out.println("Finding size of a treeset"+" "+s.size());

//check if an element exists in Treeset
		String name="Julia";
		if(s.contains(name)){
			System.out.println("Treeset contains the element"+" "+name);

		}
		else
		{
			System.out.println("Treeset does not contain the element");
		}

		//Navigating through the Treeset

		System.out.println("First element"+" "+s.first());
		System.out.println("Last Element"+" "+s.last());

		name="Robert";
		System.out.println("Elements just greater than"+" "+name+"---> "+s.higher(name));
		System.out.println("Elements just greater than"+" "+name+"---> "+s.lower(name));



	}

}
