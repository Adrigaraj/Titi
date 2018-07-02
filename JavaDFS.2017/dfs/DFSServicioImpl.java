// Clase de servidor que implementa el servicio DFS

package dfs;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DFSServicioImpl extends UnicastRemoteObject implements DFSServicio {
	public DFSServicioImpl() throws RemoteException {

	}
}
