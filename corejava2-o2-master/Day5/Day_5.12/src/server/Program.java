package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT_NUMBER = 5689;
	public static void main(String[] args) {
		try( ServerSocket ss = new  ServerSocket(PORT_NUMBER);
			 Socket socket =  ss.accept();
			 DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			 DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			 Scanner sc = new Scanner(System.in);
			){
			String message = "";
			do
			{
				System.out.print("S:Server	:	");
				message = sc.nextLine();
				dos.writeUTF(message);
				dos.flush();
				
				message = dis.readUTF();
				System.out.println("S:Client	:	"+message);
			}while( !message.equalsIgnoreCase("end"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
