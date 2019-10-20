import java.io.IOException;

class ThrowsExample {
	void myMethod(int num)throws IOException,ClassNotFoundException{
		if(num==1)
		{
			throw new IOException("IOEXception occured");

		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
}
