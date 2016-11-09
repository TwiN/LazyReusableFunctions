///////////////////////////////////////////
//////// WITHOUT SUPPORT FOR HTTPS ////////
///////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

    /**
     * Function that fetch the content of a web page.
     */
    public static String fileGetContents(String url) throws Exception {
		String content = "";
		URL siteUrl;
		try {
			siteUrl = new URL(url);
			URLConnection conn = siteUrl.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                content += inputLine;
            }
		} catch (MalformedURLException e) {
			e.printStackTrace();
			content = "Failed to fetch the data.";
		} catch (IOException e) {
			e.printStackTrace();
			content = "Failed to fetch the data.";
		}
		return content;
	}
    
    
    
////////////////////////////////////////
//////// WITH SUPPORT FOR HTTPS ////////
////////////////////////////////////////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * The library under are related to bypassing the need to provide
 * trust certificates for websites using HTTPS
 */
/* START of Trust cert. related libraries */
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/* END of Trust cert. related libraries */



    /**
     * Function that fetch the content of a web page.
     */
    public static String fileGetContents(String url) throws Exception {
		String content = "";
		URL siteUrl;
		try {
            if (url.toLowerCase().startsWith("https")) {
                trustCertificate(); // only used in case the URL has HTTPS
            }
			siteUrl = new URL(url);
			URLConnection conn = siteUrl.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                content += inputLine;
            }
		} catch (MalformedURLException e) {
			e.printStackTrace();
			content = "Failed to fetch the data.";
		} catch (IOException e) {
			e.printStackTrace();
			content = "Failed to fetch the data.";
		}
		return content;
	}
    
    /**
	 * Function that accepts all trust certificates..
	 */
	public static void trustCertificate() throws Exception {
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType)
					throws CertificateException {
				return;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType)
					throws CertificateException {
				return;
			}
		} };
		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
					System.out.println("Warning: URL host '" + urlHostName
							+ "' is different to SSLSession host '" + session.getPeerHost()
							+ "'.");
				}
				return true;
			}
		};
		HttpsURLConnection.setDefaultHostnameVerifier(hv);
	}
