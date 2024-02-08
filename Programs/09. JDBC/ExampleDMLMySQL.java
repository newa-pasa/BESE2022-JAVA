
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleDMLMySQL {
    public static void main(String[] args) {
        // JDBC URL, username, and password of your MySQL server
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";
        String tableName = "students";

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Example: Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255) NOT NULL,"
                    + "age INT"
                    + ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");

            // Example: INSERT (insert a record)
            String insertSQL = "INSERT INTO " + tableName + " (name, age) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, "John");
                preparedStatement.setInt(2, 25);
                preparedStatement.executeUpdate();
                System.out.println("Record inserted successfully");
            }

            // Example: SELECT (retrieve records)
            String selectSQL = "SELECT * FROM " + tableName;
            try (ResultSet resultSet = statement.executeQuery(selectSQL)) {
                System.out.println("Records retrieved:");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }
            }

            // Example: UPDATE (update a record)
            String updateSQL = "UPDATE " + tableName + " SET age = ? WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setInt(1, 30);
                preparedStatement.setString(2, "John");
                preparedStatement.executeUpdate();
                System.out.println("Record updated successfully");
            }

            // Example: DELETE (delete a record)
            String deleteSQL = "DELETE FROM " + tableName + " WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                preparedStatement.setString(1, "John");
                preparedStatement.executeUpdate();
                System.out.println("Record deleted successfully");
            }

            // Close resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
