// Clase de servidor que implementa el API de acceso remoto a un fichero

package dfs;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DFSFicheroServImpl extends UnicastRemoteObject implements DFSFicheroServ {
	private static final String DFSDir = "DFSDir/";
	private RandomAccessFile fich;

	static {

	}

	public RandomAccessFile getFich() {
		return fich;
	}

	public void setFich(RandomAccessFile fich) {
		this.fich = fich;
	}

	public DFSFicheroServImpl() throws RemoteException, FileNotFoundException {

	}
}
