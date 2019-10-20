import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterExample {
	public static void main(String[] args) {

		//First Method using FileWriter
		String content="This is the content to write to a file";
	try(FileWriter writer=new FileWriter("c:\\leag\\naresh.txt");BufferedWriter bw=new BufferedWriter(writer))
		{

			bw.write(content);
		}
	catch(IOException e)
		{
			System.err.format("IOException %s%n",e);
		}

		//Second method using Path
String fileContent="Hello learner !! welcome to java";
Path path= Paths.get("c:\\leag\\pathfileexample.txt");
		try {
			Files.write(path, fileContent.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
