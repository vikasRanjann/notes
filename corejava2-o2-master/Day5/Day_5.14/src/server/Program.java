package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static final int PORT_NUMBER = 5689;
	public static void main(String[] args) {
		try( DatagramSocket server = new DatagramSocket(PORT_NUMBER);
			 Scanner sc = new Scanner(System.in);){
			String message = "";
			byte[] buffer = new byte[ 1024 ];
			while( true ) {
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				server.receive(receivePacket);
				message = new String( receivePacket.getData());
				System.out.println("S:Client	:	"+message);
				
				System.out.print("S:Server	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, receivePacket.getAddress(), receivePacket.getPort());
				server.send(sendPacket);
			}
			
		}
		catch( Exception ex ){
			ex.printStackTrace();
		}
	}
}
