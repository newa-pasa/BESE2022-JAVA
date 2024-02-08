import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GcesSite {
    public static void main(String[] args) {
        // URL of the website to connect to
        String urlString = "http://gces.edu.np";

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Get and print information about the connection
            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Content Length: " + urlConnection.getContentLength());
            System.out.println("Last Modified: " + urlConnection.getLastModified());

            // Read and print the content of the website
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            System.out.println("\nWebsite Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
