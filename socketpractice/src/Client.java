import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	//initialize socket and input output streams

	private Socket socket=null;
	private DataInputStream input=null;
	private DataOutputStream output=null;

	//constructor to put ip address and port
	Client(String address,int port)
	{
		//establish a connection

		try{
			socket=new Socket(address,port);
			System.out.println("connected");

			//take inputs from terminal
			input=new DataInputStream(System.in);

			//sends output to the socket

			output=new DataOutputStream(socket.getOutputStream());
		}
		catch(UnknownHostException u)
		{
			System.out.println(u);
		}
catch (IOException i)
{
	System.out.println(i);
}

//string to read messages from input

		String line="";
		//keep reading until Over is input

		while(!line.equals("Over"))
		{

			try{
				line=input.readLine();
				output.writeUTF(line);
			}
			catch(IOException i)

			{
				System.out.println(i);
			}
		}

		try{
			input.close();
			output.close();
			socket.close();

		}
		catch (IOException i)
		{
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Client client=new Client("127.0.0.1", 5000);
	}
}
