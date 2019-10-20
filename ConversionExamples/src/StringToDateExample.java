import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
	public static void main(String[] args) {
		String sDate="31/12/1998";
		Date date1;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				System.out.println(sDate+"\t"+date1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
}
