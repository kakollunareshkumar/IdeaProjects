package treeset;
//Natural order of Custom class using Comparable


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class User implements Comparable{

private String firstName;
private String lastName;
private int salary;

public User(String firstName,String lastname,int salary)
{	super();
	this.firstName=firstName;
	this.lastName=lastname;
	this.salary=salary;
}

public void setFirstName(String firstName)
{
	this.firstName=firstName;
}

public String getFirstName(){
	return firstName;
}

public void setLastName(String lastName){
	this.lastName=lastName;

}

public String getLastName(){
	return lastName;
}

public void setSalary(int salary){
	this.salary=salary;
}
public int getSalary(){
	return  salary;
}

public String toString(){
	return "FirstName"+" "+getFirstName()+" "+"LastName"+""+getLastName()+""+"salary"+" "+getSalary();
}

	@Override
	public int compareTo(User o) {
		return this.firstName.compareTo(o.firstName);
	}


}

public class TreeSetExampleUsingComparator {

	public static void main(String[] args) {

		//putting Custom Objects in sorted order
		Set s=new TreeSet();
		System.out.println("**Users based on first Name**");
		System.out.println(s.toString());

		//Iterating over TreeSet using for loop
		System.out.println("** Iterating using for loop**");

		for(User user:s)
		{
			System.out.println(user.getFirstName());

		}
		//Iterating over TreeSet using Iterator
		System.out.println("Iterating using Iterator");

		Iterator itr=s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		s.add(new User("Anirudh", "Bhatnagar", 100));
		s.add(new User("Jack", "Daniel", 150));
		s.add(new User("kate", "Xyz", 120));
		s.add(new User("Bosco", "Ceasor", 140));


	}
}
