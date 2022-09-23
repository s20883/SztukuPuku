import Artwork.Attributes;
import Artwork.Category;
import Artwork.Data;
import com.google.gson.Gson;
import jdk.jfr.Configuration;
import org.json.simple.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


public class Main {
    private final static String baseUrl = "https://apihackaton.zacheta.art.pl/api/v1/artworks";
    private final static String bearerToken = "4f74c0681e4be0700a144231454e0b2ad2d2fe341d46908b74a448613d74bfb7e87e78696a3cecb847137f906eabf69847cbe825d885c83d8b94d4615026ae56679d8984f97204d7c08099a7fc0ab3ef0221a738c89e893664e8e3e61d39c4320cb36b79f0dc21837c698b77d6e14dcf3df45f7dcb8128b796a5f76f52eb0140";


    public static void main(String[] args) {
        List<String> descriptions = new ArrayList<>();
        descriptions.add("des1");
        descriptions.add("des2");

        List<String> keywords = new ArrayList<>();
        descriptions.add("key1");
        descriptions.add("key2");

        List<String> documentationOtherSources = new ArrayList<>();
        descriptions.add("dec1");
        descriptions.add("dec2");

        List<Attributes.SubtitleItems> subtitle = new ArrayList<>();
        subtitle.add(new Attributes.SubtitleItems("sub1"));
        subtitle.add(new Attributes.SubtitleItems("sub2"));



        Data data = new Data(
                "typ",
                "1",
                new Attributes(
                        null,
                        null,
                        "1999",
                        "inv_no_34",
                        "Opis",
                        "pl",
                        new Category("nazwa kategorii"),
                        descriptions,
                        keywords,
                        documentationOtherSources,
                        subtitle
                )

        );

        String json = new Gson().toJson(data);
        System.out.println(json);

//        try {
//            getArtwork("");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    public static String getArtwork(String command) throws IOException {

        URL url = new URL(baseUrl + command);

        HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
        try {
            conn.setSSLSocketFactory(RelaxedSSLContext.getInstance().getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        conn.setHostnameVerifier(RelaxedSSLContext.localhostValid);

        conn.setRequestProperty("Authorization","Bearer "+bearerToken);
        conn.setRequestProperty("Accept","application/vnd.api+json");
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String output;

        StringBuffer response = new StringBuffer();
        while ((output = in.readLine()) != null) {
            response.append(output);
        }

        in.close();

//        JSONObject jsonObject = new JSONObject();
//        jsonObject.


        System.out.println("Response:-" + response.toString());
        return response.toString();
    }
}


class RelaxedSSLContext {
    // Create a trust manager that does not validate certificate chains like
    public static TrustManager[] trustAllCerts = new TrustManager[] {
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    //No need to implement.
                }
                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    //No need to implement.
                }
            }
    };

    //hostname verifier. All hosts valid
    public static HostnameVerifier allHostsValid = new HostnameVerifier() {
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    };

    //hostname verifier. Only localhost and 127.0.0.1 valid
    public static HostnameVerifier localhostValid = new HostnameVerifier() {
        public boolean verify(String hostname, SSLSession session) {
            return "localhost".equals(hostname) || "127.0.0.1".equals(hostname);
        }
    };


    public static SSLContext getInstance() throws KeyManagementException, NoSuchAlgorithmException{
        return getInstance("SSL");
    }

    //get a 'Relaxed'  SSLContext with no trust store (all certificates are valids)
    public static SSLContext getInstance(String protocol) throws KeyManagementException, NoSuchAlgorithmException{
        SSLContext sc = SSLContext.getInstance(protocol);
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        return sc;
    }
}
