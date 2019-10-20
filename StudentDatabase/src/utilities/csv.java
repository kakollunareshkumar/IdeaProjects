package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class csv {
	//this method will read from a csv file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		try {
			String dataRow;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow=br.readLine())!=null){
				String[] dataRecords=dataRow.split(",");
				data.add(dataRecords);

			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Could not find file");
		} catch (IOException e)
		{
			System.out.println("could not read file");
         e.printStackTrace();
		}
		return data;
	}

}
