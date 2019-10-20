import java.io.File;

public class CreateDirectoryExample {
	public static void main(String args[]){
		//Create a Single Directory
		File file=new File("c\\leag\\Friday");

		if(!(file.exists()))
		{
			if(file.mkdirs())
			{
				System.out.println("Directory is created");
			}
			else{
				System.out.println("Directory is not created");
			}
		}
		//Create Multiple Directories
		File files=new File("c:\\leag\\sub1\\sub2");
		if(!file.exists()){
			if(files.mkdirs())
			{
				System.out.println("Multiple directories are created");
			}
			else{
				System.out.println("Failed to create multiple directories");
			}
		}

	}
}
