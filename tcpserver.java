import java.lang. *;
import java.io. *;
import java.net. *;

class tcpserver
{
	public static void main(String [] args)
	{
		String data = "Welcome to server side";
		try
		{
			ServerSocket server = new ServerSocket(1234);
			Socket skt = server.accept();
			System.out.println("Yeah !! Server has connected\n");
			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
			System.out.println("Sending string: '" + data + "\n");
			out.print(data);
			out.close();
			skt.close();
			server.close();
		}
		catch(Exception e)
		{
			System.out.println("Oops, It didn't work !\n");
		}
	}
}
