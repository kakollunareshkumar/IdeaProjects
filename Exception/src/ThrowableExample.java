public class ThrowableExample {

	static void checkEligibility(int age,int weight)
	{
		if(age<12&&weight<40){
		throw new ArithmeticException("student is not eligible for registration");
	}
		else{
			System.out.println("student entry is valid");
		}
	}



	public static void main(String[] args) {
		System.out.println("welcome to registration process");
		checkEligibility(10,39);
		System.out.println("Have a nice day");

	}
}
