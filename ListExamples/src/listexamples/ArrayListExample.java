package listexamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println(animals);
		animals.add(2, "Elephant");
		System.out.println(animals);

		List<String> birds=new ArrayList<>();
		birds.add("pigeon");
		birds.add("hen");
		List<String> birdsanimals=new ArrayList<>();
		birdsanimals.addAll(animals);
		birdsanimals.addAll(birds);
		System.out.println("Birds and Animals"+birdsanimals);

		System.out.println("Animal at 0 index"+birdsanimals.get(0));
		System.out.println("Total no of birdsanimals"+birdsanimals.size());
		System.out.println("Is BirdsAndAnimals list is empty"+birdsanimals.isEmpty());
		System.out.println("Set element 4 walmart "+birdsanimals.set(4, "walmart"));
		System.out.println("birdsanimals after modification"+birdsanimals);
		System.out.println("Removing elements from list"+birdsanimals.remove(5));
		System.out.println("Removing All elements"+birdsanimals.removeAll(birdsanimals));




	}
}
