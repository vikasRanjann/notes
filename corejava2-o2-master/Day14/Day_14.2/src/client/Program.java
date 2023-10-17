package client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Program {
	public static final int PORT = 7865;
	public static void main(String[] args) {
		try(SocketChannel channel = SocketChannel.open();
			Scanner sc = new Scanner(System.in)) {
			channel.socket().connect(new InetSocketAddress("localhost", PORT));
			ByteBuffer buffer = ByteBuffer.allocate(256);
			String message = "";
			do
			{
				buffer.clear();
				channel.read(buffer);
				System.out.print("C:Server	:	");
				while( buffer.hasRemaining()) {
					message = new String( buffer.array());
					System.out.print(message+" ");
				}
				System.out.println();
				
				buffer.flip();
				System.out.print("C:Client	:	");
				message = sc.nextLine();
				buffer.put(message.getBytes());
				while( buffer.hasRemaining())
					channel.write(buffer);
				
			}while(!message.equalsIgnoreCase("end"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
