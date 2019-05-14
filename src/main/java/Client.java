import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Client {
    static String exec() {
        // mac zulu11.29.11-ca-jdk11.0.2 
        // String url = "https://yahoo.co.jp"; 
        // ->200
        //String url = "https://www.yahoo.co.jp/";
        // ->200 
        //String url = "https://www.google.co.jp/";
        // ->200 

        HttpClient client = new DefaultHttpClient();

        HttpGet get = new HttpGet(url);

        try {
            HttpResponse response = client.execute(get);
            System.out.println(response.getStatusLine().getStatusCode());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            get.releaseConnection();
        }
        return null;
    }
}
