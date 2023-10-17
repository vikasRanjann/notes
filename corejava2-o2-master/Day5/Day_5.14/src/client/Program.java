package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT_NUMBER = 5689;
	public static void main(String[] args) {
		try( DatagramSocket client = new DatagramSocket();
			 Scanner sc = new Scanner(System.in);){
			String message = "";
			byte[] buffer;
			while( true ){
				System.out.print("C:Client	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), PORT_NUMBER);
				client.send(sendPacket);
				
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				client.receive(receivePacket);
				message = new String( receivePacket.getData());
				System.out.println("C:Server	:	"+message);
			}
		}
		catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
