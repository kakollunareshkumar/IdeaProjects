import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleUsing {
	public static void main(String[] args) {
		FileReader f= null;
		try {
			f = new FileReader("c:\\leag\\plainoutput.txt");
			int i;
			while((i=f.read())!=-1){
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException io)
		{
			System.out.println(io);
		}


	}

}
