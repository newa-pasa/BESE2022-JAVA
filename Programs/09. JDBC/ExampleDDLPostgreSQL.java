import java.sql.*;

public class ExampleDDLPostgreSQL {

    public static void main(String[] args) {
        // JDBC URL, username, and password of your PostgreSQL server
        String driverClassName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "postgres";

        // Database name to be created
        String databaseName = "school";
        String tableName = "students";

        try {
            // Register the PostgreSQL JDBC driver
            Class.forName(driverClassName);

            // Open a connection to the default database (postgres)
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Example: Create a new database
            String createDatabaseSQL = "CREATE DATABASE " + databaseName; // postgres
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully");

            connection.close(); // Close the connection to the default database
            connection = DriverManager.getConnection(url + databaseName, user, password);
            statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "id SERIAL PRIMARY KEY,"
                    + "name VARCHAR(255) NOT NULL,"
                    + "age INT"
                    + ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");

            // Example: Alter table (add a new column)
            String alterTableSQL = "ALTER TABLE " + tableName + " ADD COLUMN IF NOT EXISTS email VARCHAR(255)";
            statement.executeUpdate(alterTableSQL);
            System.out.println("Table altered successfully");

            // Example: Drop table (if exists)
            String dropTableSQL = "DROP TABLE IF EXISTS " + tableName;
            statement.executeUpdate(dropTableSQL);
            System.out.println("Table dropped successfully");

            connection.close(); // Close the connection to the selected database
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String dropDatabaseSQL = "DROP DATABASE " + databaseName;
            statement.executeUpdate(dropDatabaseSQL);
            System.out.println("Database deleted successfully");

            // Close resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
