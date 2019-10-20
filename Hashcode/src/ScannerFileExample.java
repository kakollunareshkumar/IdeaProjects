import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileExample {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("c:\\leag\\plainoutput.txt");

		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
			{
				System.out.println(e);
			}
		}

	}


