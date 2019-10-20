public class StringToFloat {
	public static void main(String[] args) {
		String s="23.6";
		float f=Float.parseFloat("23.6");
		System.out.println(f);

		Float f1=Float.valueOf(s);
		System.out.println(f1);
	}
}
