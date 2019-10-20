import java.util.ArrayList;

public class Customer {

	String name;
	int balance;
	int id;

	public Customer(String name, int balance, int id) {
		this.name = name;
		this.balance = balance;
		this.id = id;
	}

	public String toString(){
		return "name"+" "+name+" "+"balance"+" "+balance+"id"+" "+id;
	}

	public static void main(String[] args) {

		ArrayList<Customer> l=new ArrayList<>();
		Customer c1=new Customer("naresh", 10000, 1);
		Customer c2=new Customer("suresh",5000, 2);
		Customer c3=new Customer("harsha", 10000, 3);
		Customer c4=new Customer("prasad",5000, 4);
		Customer c5=new Customer("sachin", 10000, 5);
		Customer c6=new Customer("kiran",5000, 6);

		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		l.add(c6);

		for(Customer cu:l)
		{
			System.out.println(cu);
		}
	}
}
