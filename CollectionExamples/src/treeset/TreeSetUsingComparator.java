package treeset;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class UserSalaryComparator implements Comparator {


	@Override
	public int compare(User o1, User o2) {
		if (o1.getSalary() >= o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class TreeSetUsingComparator {
	public static void main(String[] args) {
		Set s=new TreeSet(new UserSalaryComparator());

		s.add(new User("Anirudh", "Bhatnagar", 100));
		s.add(new User("Jack", "Daniel", 150));
		s.add(new User("kate","Xyz",120));
		s.add(new User("Bosco","ceasor",140));

	}


}
