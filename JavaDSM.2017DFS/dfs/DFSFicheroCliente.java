// Clase de cliente que proporciona el API del servicio DFS

package dfs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

public class DFSFicheroCliente {
	private DFSCliente dfs;

	public DFSFicheroCliente(DFSCliente dfs, String nom, String modo)
			throws RemoteException, IOException, FileNotFoundException {
		this.dfs = dfs;
		if (modo.equals("r")) {

		} else if (modo.equals("rw")) {

		}
	}

	public int read(byte[] b) throws RemoteException, IOException {
		return 0;
	}

	public void write(byte[] b) throws RemoteException, IOException {
	}

	public void seek(long p) throws RemoteException, IOException {
	}

	public void close() throws RemoteException, IOException {
	}
}
