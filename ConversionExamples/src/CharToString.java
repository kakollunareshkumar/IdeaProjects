public class CharToString {
	public static void main(String[] args) {
		char c='s';
		String s=String.valueOf("String is"+c);
		System.out.println(s);
		//using Character.toString method
		String s1=Character.toString(c);
		System.out.println(s1);


	}
}
