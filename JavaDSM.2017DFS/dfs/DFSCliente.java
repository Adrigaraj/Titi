// Clase de cliente que proporciona acceso al servicio DFS

package dfs;

public class DFSCliente {
	private int tamBloque;
	private int tamCache;
	private String ipServidor;
	private int puerto;

	public DFSCliente(int tamBloque, int tamCache) {
		this.ipServidor = System.getProperty("SERVIDOR");
		this.puerto = Integer.parseInt(System.getProperty("PUERTO"));

	}
}
