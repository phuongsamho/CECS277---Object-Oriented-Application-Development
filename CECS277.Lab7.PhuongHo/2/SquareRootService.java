import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SquareRootService {
	private Socket s;
	public SquareRootService(Socket aSocket)
	{
		s = aSocket;
	}
	
	public void doService() throws IOException
	{
		InputStream ip = s.getInputStream();
		Scanner in = new Scanner(ip);
		OutputStream op = s.getOutputStream();
		PrintWriter out = new PrintWriter(op);
		
		double response = Math.sqrt(in.nextDouble());
		System.out.println("Sending: " + response);
		out.println(response);
		out.flush();	
	}
}
