package server;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Program {
	public static final int PORT = 7865;
	public static void main(String[] args) {
		try(ServerSocketChannel channel = ServerSocketChannel.open();
			Scanner sc = new Scanner(System.in);){
			channel.socket().bind(new InetSocketAddress(PORT));
			SocketChannel clientChanel = channel.accept();
			ByteBuffer buffer = ByteBuffer.allocate(256);
			String message = "";
			do {
				buffer.clear();
				System.out.print("S:Server	:	");
				message = sc.nextLine();
				buffer.put(message.getBytes());
				while(buffer.hasRemaining())
					clientChanel.write(buffer);
				
				buffer.flip();
				clientChanel.read(buffer);
				System.out.print("S:client	:	");
				while( buffer.hasRemaining()) {
					message = new String( buffer.array());
					System.out.print(message+" ");
				}
				System.out.println();
				
			}while(!message.equalsIgnoreCase("end"));
		}
		catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
