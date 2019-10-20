public class Simple extends Object {
String name;

	public Simple(String str){
		this.name=str;
	}
	public static void main(String[] args) {
		int a=20;
		int b=20;
		if(a==b){
			System.out.println("a and b are equal");   //true
		}
		else
		{
			System.out.println("a and b are different");
		}
		String s="hello";
		String s2="hello";
		if(s.equals(s2)){
			System.out.println("s and s2 are equal"); //true
		}
		else
		{
			System.out.println("s and s2 are different");
		}


		Simple s3=new Simple("hello");
		Simple s4=new Simple("hello");

		if(s3==s4){
			System.out.println("s3 and s4 are equal through == operator");
		}
		else
		{
			System.out.println("s3 and s4 are not equal through == operator"); //true
		}
		if(s3.equals(s4)){
			System.out.println("s3 and s4 are equal");   //true
		}
		else
		{
			System.out.println("s3 and s4 are not equal");
		}
	}
}
