import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



	public class FileReaderExample {
		public static void main(String[] args) {
			StringBuilder sb=new StringBuilder();

			try(BufferedReader br= Files.newBufferedReader(Paths.get("C:\\leag\\plainoutput.txt")))

			{
				String line;
				while((line=br.readLine())!=null)
				{
					sb.append(line).append("\n");
				}

			}
			catch(IOException e)
			{
				System.err.format("IOException: %s%n",e);
			}
			System.out.println(sb);

		}
	}

