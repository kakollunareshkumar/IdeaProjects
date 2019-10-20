import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFileExample {
	public static void main(String[] args) {

		String file="c:\\leag\\Empdet.csv";
		String line="";
		//we have to split the file from commas
		String splitBy=",";
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{  	//loop will continue untill the line ends
			while((line=br.readLine())!=null)
			{
				//split function use to split the words in the line by commas
				String[] name=line.split(splitBy);
				System.out.println("Firstname"+name[0]+" "+"LastName"+" "+name[1]+" "+"Stream"+" "+name[2]+" "+"branch"+" "+name[3]+"Age"+" "+name[4]);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
