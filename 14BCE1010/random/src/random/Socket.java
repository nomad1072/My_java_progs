package random;
import java.net.*;
import java.io.*;
public class Socket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket sock=new ServerSocket(6013);
			while(true) {
				java.net.Socket client=sock.accept();
				PrintWriter pout=new PrintWriter(client.getOutputStream(),true);
				pout.println(new java.util.Date().toString());
				client.close();
				
			}
		}catch(IOException e)
		{
			System.err.println(e);
		}

	}

}
