import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
  
  
  
  /**
	 * Gets the IP of an hostname
	 * @param hostname  Hostname or URL (ex: https://twinnation.org/)
	 * @return The IP of the website
	 */
	public static String getIP(String hostname) {
		if (!hostname.startsWith("http://") && !hostname.startsWith("https://")) {
			hostname = "http://"+hostname;
		}
		InetAddress address = null;
		try {
			address = InetAddress.getByName(new URL(hostname).getHost());
		} catch (Exception e) {
            e.printStackTrace();
			return "";
		}
		return address.getHostAddress();
	}
