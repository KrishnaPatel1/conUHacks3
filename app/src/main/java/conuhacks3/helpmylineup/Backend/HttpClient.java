package conuhacks3.helpmylineup.Backend;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONObject;

public class HttpClient {
    public static JSONArray GET(String targetURL) throws ProtocolException, IOException, JSONException {
        URL url = new URL(targetURL);
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("Content-Type",
                "application/json");
        connect.setRequestProperty("Accept", "application/json");
        connect.setDoOutput(true);

        System.out.println(connect.getResponseCode());
        InputStream inputStream = connect.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        bufferedReader.close();
        System.out.println(response.toString());
        return new JSONArray(response.toString());
    }
}
