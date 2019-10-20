public class TryCatchExample {
	public static void main(String[] args) {
		int num1,num2;
		try
		{
		num1=0;
		num2=62/num1;
			System.out.println(num2);
			System.out.println("hey i am at the end of the try block");

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception occurred");
		}


	}
}
