import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetExample {
    public static void main(String[] args) {
        try {
            // Specify the URL to send the GET request to
            String urlString = "https://petstore.swagger.io/v2/pet/findByStatus?status=sold";

            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            urlConnection.setRequestMethod("GET");

            // Get the response code
            int responseCode = urlConnection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response from the server
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                System.out.println("\nServer Response:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // Disconnect the connection
            urlConnection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}