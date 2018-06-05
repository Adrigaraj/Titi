// Clase de cliente que proporciona acceso al servicio DFS

package dfs;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class DFSCliente {
	private int tamBloque;
	private int tamCache;
	private String ipServidor;
	private int puerto;
	private DFSFicheroServImpl refFich;

	public DFSFicheroServImpl getRefFich() {
		return refFich;
	}

	public DFSCliente(int tamBloque, int tamCache) {
		this.ipServidor = "localhost"; // System.getProperty("SERVIDOR");
		this.puerto = 8013;// Integer.parseInt(System.getProperty("PUERTO"));
		try {
			refFich = (DFSFicheroServImpl) Naming.lookup("rmi://" + ipServidor + ":" + puerto + "/DFSDir/");

		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			System.err.println("DFSCliente exception: " + e.getMessage() + e.getStackTrace());
		}
	}

}
