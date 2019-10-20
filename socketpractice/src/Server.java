import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

private Socket socket=null;
private ServerSocket server=null;
private DataInputStream input=null;
//constructor with port

	public  Server(int port)
	{
		//starts server and waits for a connection

		try{

			server=new ServerSocket(port);
			System.out.println("server started");

			System.out.println("waiting for a client");

			socket=server.accept();
			System.out.println("client accepted");

			//takes input from the client socket

			input=new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			String line="";

			//reads message from client until Over is sent
			while(!line.equals("over"))
			{
				try{

					line=input.readUTF();
					System.out.println(line);

				}
				catch (IOException i)
				{
					System.out.println(i);
				}
			}

			System.out.println("closing connection");
			socket.close();
			input.close();
		}
		 catch (IOException i)
		 {
			 System.out.println(i);
		 }
	}

	public static void main(String[] args) {
		Server server=new Server(5000);
	}

}
