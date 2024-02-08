import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpPostExample {
    public static void main(String[] args) {
        // URL to make the POST request to
        String urlString = "https://petstore.swagger.io/v2/pet";

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            urlConnection.setRequestMethod("POST");

            // Enable input and output streams for reading and writing data
            urlConnection.setDoOutput(true);

            // Set additional headers if needed
            urlConnection.setRequestProperty("Content-Type", "application/json");

            // Example payload for the POST request (replace with your actual data)
            String postData = "{" + //
                                "  \"id\": 0," + //
                                "  \"category\": {" + //
                                "    \"id\": 0," + //
                                "    \"name\": \"string\"" + //
                                "  }," + //
                                "  \"name\": \"doggie\"," + //
                                "  \"photoUrls\": [" + //
                                "    \"string\"" + //
                                "  ]," + //
                                "  \"tags\": [" + //
                                "    {" + //
                                "      \"id\": 0," + //
                                "      \"name\": \"string\"" + //
                                "    }" + //
                                "  ]," + //
                                "  \"status\": \"available\"" + //
                                "}";

            // Convert the payload to bytes
            byte[] postDataBytes = postData.getBytes(StandardCharsets.UTF_8);

            // Get the output stream to write the data to be sent in the POST request
            try (OutputStream outputStream = urlConnection.getOutputStream()) {
                outputStream.write(postDataBytes);
                outputStream.flush();
            }

            // Get and print the response from the server
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
