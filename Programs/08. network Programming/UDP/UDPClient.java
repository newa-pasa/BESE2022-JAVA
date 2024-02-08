import java.net.*;
import java.io.*;

public class UDPClient{

	public static void main(String[] args) {
		String msg = "i am client";
		DatagramSocket socket = null;
		try
		{
			socket = new DatagramSocket();
			byte[] m = msg.getBytes();
			InetAddress server_ip = InetAddress.getByName("192.168.1.23");
			int server_port = 6789;
			DatagramPacket request = new DatagramPacket(m, m.length, server_ip, server_port);
			socket.send(request);
			System.out.println("message sent toserver....");
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

			socket.receive(reply);
			System.out.println("message from server: " + new String(reply.getData()));
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