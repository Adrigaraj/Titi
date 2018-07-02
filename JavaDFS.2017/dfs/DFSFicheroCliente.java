// Clase de cliente que proporciona el API del servicio DFS

package dfs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.rmi.RemoteException;

public class DFSFicheroCliente {
	private DFSCliente dfs;

	public DFSFicheroCliente(DFSCliente dfs, String nom, String modo)
			throws RemoteException, IOException, FileNotFoundException {
		this.dfs = dfs;
		dfs.getRefFich().setFich(new RandomAccessFile(nom, modo));
	}

	public int read(byte[] b) throws RemoteException, IOException {
		return 0;
	}

	public void write(byte[] b) throws RemoteException, IOException {
		if (dfs != null) {
			dfs.getRefFich().getFich().write(b, 0, b.length);
		}
	}

	public void seek(long p) throws RemoteException, IOException {
		if (dfs != null) {
			dfs.getRefFich().getFich().seek(p);
		}
	}

	public void close() throws RemoteException, IOException {
		if (dfs != null) {
			dfs.getRefFich().getFich().close();
		}
	}
}
