import java.net.*;
import java.io.*;

public class UDPServer{

	public static void main(String[] args) {
		DatagramSocket socket = null;
		byte[] buffer = new byte[1000];
		try
		{
			socket = new DatagramSocket(6789);
			while(true)
			{
				System.out.println("Server waiting for message from cleint... ");
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				socket.receive(request);

				System.out.println("message from cleint: " + new String(request.getData()));
				DatagramPacket reply = new DatagramPacket(request.getData(), request.getLength(), request.getAddress(), request.getPort());
				socket.send(reply);
				System.out.println("Same message replied to cleint.");
			}
		}
		catch(SocketException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(socket != null)
				socket.close();
		}
	}
}