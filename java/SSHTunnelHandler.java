import java.util.Properties;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHTunnelHandler {

	public static final String SERVER_IP           = "35.182.247.21";
	public static final String SERVER_USERNAME     = "ubuntu";
	public static final String SERVER_PRIVKEY_PATH = "E:\\Dropbox\\School\\CEGEP\\SESSION_7\\OUTILS_DB\\amazonkey.pem";
	public static final int    SERVER_PORT         = 3306;
	public static final int    LOCAL_BINDED_PORT   = 3366;
	
	
	private static Session currentSession = null;
	

	private static Session doSSHTunnelByPassword(String sshUser, String sshPassword, String sshHost, 
		  String remoteHost, int localPort, int remotePort) throws JSchException {
		final JSch jsch = new JSch();
		Session session = jsch.getSession(sshUser, sshHost, 22);
		session.setPassword(sshPassword);

		final Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");
		session.setConfig(config);

		session.connect();
		session.setPortForwardingL(localPort, remoteHost, remotePort);
		return session;
	}
	
	
	private static Session doSSHTunnelByKey(String sshUser, String sshKeyPath, String sshHost,
		  String remoteHost, int localPort, int remotePort) throws JSchException {
		final JSch jsch = new JSch();
		Session session = jsch.getSession(sshUser, sshHost, 22);
		jsch.addIdentity(sshKeyPath);

		final Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");
		session.setConfig(config);

		session.connect();
		session.setPortForwardingL(localPort, remoteHost, remotePort);
		return session;
		
	}
	
	
	public static void createSSHTunnel() {
		try {
			currentSession = doSSHTunnelByKey(SERVER_USERNAME, SERVER_PRIVKEY_PATH, SERVER_IP, "localhost", LOCAL_BINDED_PORT, SERVER_PORT);
		} catch (JSchException e) {
			e.printStackTrace();
			System.out.println("Failed to create SSH tunnel, disconnecting now");
			if (currentSession.isConnected()) {
				currentSession.disconnect();
			}
			System.exit(1);
		}
	}
	
	
	public static void closeSSHTunnel() {
		currentSession.disconnect();
	}
	
}
