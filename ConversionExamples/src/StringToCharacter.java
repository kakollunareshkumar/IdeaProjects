public class StringToCharacter {
	public static void main(String[] args) {
		String s="hello";
		char c=s.charAt(0);
		System.out.println(c);

		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			System.out.println("char at"+i+"index is"+"-------> "+c1);
		}
	}
}
