package implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import specification.Math;

public class Calculator extends UnicastRemoteObject implements Math {
	private static final long serialVersionUID = -1026191665502491842L;
	public Calculator() throws RemoteException{
	}
	@Override
	public int sum(int num1, int num2) throws RemoteException {
		return num1 + num2;
	}
	@Override
	public int sub(int num1, int num2) throws RemoteException {
		return num1 - num2;
	}
}
