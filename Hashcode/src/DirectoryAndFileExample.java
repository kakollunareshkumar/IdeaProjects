import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryAndFileExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean success=false;
		System.out.println("Enter path of directory to create");
		String dir=sc.nextLine();

		File directory=new File(dir);
		if(directory.exists())
		{
			System.out.println("Directory already exists");

		}
		else{
			System.out.println("Directory not exits Creating now");
			success=directory.mkdirs();
			if(success){
				System.out.printf("Successfully created new directory : %s%n", dir);
			}
			else
			{
				System.out.printf("Failed to create new directory %s %n",dir);
			}
			//creating new file in java, only if exists


			File f=new File(dir+"\\"+"createdb.txt");
			try {
				if (!f.exists()) {
					success = f.createNewFile();
					if (success) {
						System.out.printf("successfully created new file %s %n", f);

					} else {
						System.out.println("Failed to create new file");
					}
				}
			}
			catch (IOException e){
				System.out.println(e);
			}
			finally {
				sc.close();
			}

		}

		}
}
