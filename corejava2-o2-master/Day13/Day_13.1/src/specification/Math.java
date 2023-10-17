package specification;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Math extends Remote {
	int sum( int num1, int num2 )throws RemoteException;
	int sub( int num1, int num2 )throws RemoteException;
}
