import java.net.*;
import java.io.*;
public class TCPServer {
	public static void main (String args[]) {
		try{
			int serverPort = 9999;
			ServerSocket listenSocket = new ServerSocket(serverPort);
			while(true) {
				System.out.println("Before accept");
				Socket clientSocket = listenSocket.accept();
				System.out.println("After accept");
				Connection c = new Connection(clientSocket);
			}
		} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
	}
}
class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	public Connection (Socket aClientSocket) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out =new DataOutputStream( clientSocket.getOutputStream());
			this.start();
		} catch(IOException e) {System.out.println("Connection:"+e.getMessage());}
	}
	public void run(){
try { // an echo server
	String data = in.readUTF();
	out.writeUTF(data);
} catch(EOFException e) {System.out.println("EOF:"+e.getMessage());
} catch(IOException e) {System.out.println("IO:"+e.getMessage());
} finally { try {clientSocket.close();}catch (IOException e){/*close failed*/}}
}
}