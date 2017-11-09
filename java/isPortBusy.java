import java.io.IOException;
import java.net.Socket;

...



    /**
	 * Checks if the port on a given host is busy 
	 * @param host Target host (ip, domain name)
	 * @param port Port to check
	 * @return Whether the port on the given host is busy 
	 */
	public static boolean isPortBusy(String host, int port) {
		try {
			(new Socket(host, port)).close();
		} catch(IOException e) {
			return false; // Couldn't connect to host:port (port not in use)
		}
		return true; // Connected to host:port (port in use)
	}
   
