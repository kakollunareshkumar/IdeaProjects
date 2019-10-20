import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter string ");
		//string input
		String name=sc.nextLine();

		//character input
		System.out.println("enter character ");
		char gender=sc.next().charAt(0);

		//Numerical data input
		//byte,short and float can be read using similar named functions
		System.out.println("enter integer ");
		int age=sc.nextInt();
		System.out.println("enter long number ");
		long mobileNo=sc.nextLong();
		System.out.println("enter double ");
		double cgpa=sc.nextDouble();

		System.out.println("name"+name);
		System.out.println("gender"+gender);
		System.out.println("Age"+age);
		System.out.println("cgpa"+cgpa);



	}
}
