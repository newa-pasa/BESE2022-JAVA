import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main (String args[]) {
		// arguments supply message and hostname of destination
		Socket s = null;
		try{
			String ip  = "localhost";
			int serverPort = 9999;

			s = new Socket(ip, serverPort);
			DataInputStream in = new DataInputStream( s.getInputStream());
			DataOutputStream out = new DataOutputStream( s.getOutputStream());
			// out.writeUTF("Hello world");
			String data = in.readUTF();
			System.out.println("Received: "+ data) ;
		}catch (UnknownHostException e){
			System.out.println("Sock:"+e.getMessage());
		} catch (EOFException e){
			System.out.println("EOF:"+e.getMessage());
		} catch (IOException e){
			System.out.println("IO:"+e.getMessage());
		} finally {
			if(s!=null) 
				try {s.close();}catch (IOException e){/*close failed*/}
		}
	}

	public static void printSocketDetails(Socket socket) {
        try {
            // Get local and remote InetAddress and port information
            InetAddress localAddress = socket.getLocalAddress();
            InetAddress remoteAddress = socket.getInetAddress();
            int localPort = socket.getLocalPort();
            int remotePort = socket.getPort();

            // Display the information
            System.out.println("Local IP: " + localAddress.getHostAddress());
            System.out.println("Local Port: " + localPort);
            System.out.println("Remote IP: " + remoteAddress.getHostAddress());
            System.out.println("Remote Port: " + remotePort);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}