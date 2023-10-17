package test;

import java.net.Inet4Address;
import java.net.InetAddress;

public class Program {
	public static void main(String[] args) throws Exception{
		InetAddress localhost = Inet4Address.getLocalHost();
		String hostName =  localhost.getHostName();
		String hostAddress =  localhost.getHostAddress();
		System.out.println(hostName+"	"+hostAddress);
	}
}
