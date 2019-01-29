import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SquareRootServer {

	public static void main(String[] args) throws IOException {
		final int PORT = 8899;
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Waiting for clients to connect...");
		while(true)
		{
			Socket s = server.accept();
			SquareRootService service = new SquareRootService(s);
			service.doService();
			s.close();
		}
	}

}
